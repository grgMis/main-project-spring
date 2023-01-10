package com.example.mainproject.service;

import com.example.mainproject.entity.ActionGroupEntity;
import com.example.mainproject.entity.ActionTypeEntity;
import com.example.mainproject.entity.EquipmentClassEntity;
import com.example.mainproject.repository.ActionGroupRepo;
import com.example.mainproject.repository.ActionTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionTypeService {

    @Autowired
    private ActionTypeRepo actionTypeRepo;

    @Autowired
    private ActionGroupRepo actionGroupRepo;

    public ActionTypeEntity createData(ActionTypeEntity actionType, Long id){
        ActionGroupEntity actionGroup = actionGroupRepo.findById(id).get();
        actionType.setAction_group_id(actionGroup);
        return actionTypeRepo.save(actionType);
    }

    public ActionTypeEntity getOne(Long id) {
        ActionTypeEntity actionType = actionTypeRepo.findById(id).get();
        return actionType;
    }

    public Long deleteOne(Long id){
        actionTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, ActionTypeEntity actionType) {
        ActionTypeEntity entity = actionTypeRepo.findById(id).get();
        entity.setAction_type_name(actionType.getAction_type_name());
        entity.setAction_type_sname(actionType.getAction_type_sname());
        actionTypeRepo.save(entity);
        return id;
    }
}
