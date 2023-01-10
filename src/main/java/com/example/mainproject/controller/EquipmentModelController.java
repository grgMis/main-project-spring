package com.example.mainproject.controller;

import com.example.mainproject.entity.EquipmentClassEntity;
import com.example.mainproject.entity.EquipmentModelEntity;
import com.example.mainproject.service.EquipmentModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/equipModel")
public class EquipmentModelController {

    @Autowired
    private EquipmentModelService equipmentModelService;

    @PostMapping
    public ResponseEntity createEquipModel(@RequestBody EquipmentModelEntity equipmentModel,
                                           @RequestParam Long equip_class_id){
        try {
            return ResponseEntity.ok(equipmentModelService.createData(equipmentModel, equip_class_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getEquipModel(@RequestParam Integer equip_model_id) {
        try {
            return ResponseEntity.ok(equipmentModelService.getOne(equip_model_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{equip_model_id}")
    public ResponseEntity deleteEquipModel(@PathVariable Integer equip_model_id) {
        try {
            return ResponseEntity.ok(equipmentModelService.deleteOne(equip_model_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @PutMapping
    public ResponseEntity updateEquipModel(@RequestParam Integer equip_model_id,
                                           @RequestBody EquipmentModelEntity equipmentModel) {
        try {
            return ResponseEntity.ok(equipmentModelService.updateData(equip_model_id, equipmentModel));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }
}
