package com.example.mainproject.controller;

import com.example.mainproject.entity.ActionEquipmentEntity;
import com.example.mainproject.service.ActionEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/actionEquip")
public class ActionEquipmentController {

    @Autowired
    private ActionEquipmentService actionEquipmentService;

    @GetMapping("/actionEquipAll")
<<<<<<< HEAD
    public List<ActionEquipmentEntity> getActionEquipAll() {
=======
    List<ActionEquipmentEntity> getactionEquiAll() {
>>>>>>> parent of 31311a4 (create models)
        return actionEquipmentService.getAll();
    }

    @PostMapping
    public ResponseEntity createActionEquip(@RequestBody ActionEquipmentEntity actionEquipmentEntity,
                                           @RequestParam Integer action_oper_id,
                                           @RequestParam Long equip_class_id,
                                           @RequestParam Integer equip_model_id,
                                           @RequestParam Integer equip_id,
                                           @RequestParam Long equip_state_id){
        try {
            return ResponseEntity.ok(actionEquipmentService.createData(actionEquipmentEntity,
                    action_oper_id, equip_class_id, equip_model_id, equip_id, equip_state_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getActionEquip(@RequestParam Integer action_equip_id) {
        try {
            return ResponseEntity.ok(actionEquipmentService.getOne(action_equip_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{action_equip_id}")
    public ResponseEntity deleteActionEquip(@PathVariable Integer action_equip_id) {
        try {
            return ResponseEntity.ok(actionEquipmentService.deleteOne(action_equip_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @PutMapping
    public ResponseEntity updateActionEquip(@RequestParam Integer action_equip_id,
                                           @RequestBody ActionEquipmentEntity actionEquipmentEntity) {
        try {
            return ResponseEntity.ok(actionEquipmentService.updateData(action_equip_id, actionEquipmentEntity));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }
}
