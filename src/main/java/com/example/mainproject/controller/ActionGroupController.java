package com.example.mainproject.controller;

import com.example.mainproject.entity.ActionGroupEntity;
import com.example.mainproject.service.ActionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actionGroup")
public class ActionGroupController {

    @Autowired
    private ActionGroupService actionGroupService;

    @PostMapping
    public ResponseEntity createActionGroup(@RequestBody ActionGroupEntity actionGroup) {
        try {
            actionGroupService.createData(actionGroup);
            return ResponseEntity.ok("Группа успешно сохранена");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @GetMapping
    public ResponseEntity getActionGroup(@RequestParam Long action_group_id) {
        try {
            return ResponseEntity.ok(actionGroupService.getOne(action_group_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @DeleteMapping("/{action_group_id}")
    public ResponseEntity deleteActionGroup(@PathVariable Long action_group_id) {
        try {
            return ResponseEntity.ok("Групппа удалена: " + actionGroupService.deleteOne(action_group_id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }

    @PutMapping
    public ResponseEntity updateActionGroup(@RequestParam Long action_group_id,
                                            @RequestBody ActionGroupEntity actionGroup) {
        try {
            return ResponseEntity.ok("Группа переименована: " + actionGroupService.updateData(action_group_id, actionGroup));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошлка ошибка");
        }
    }
}