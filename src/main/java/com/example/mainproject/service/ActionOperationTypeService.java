package com.example.mainproject.service;

import com.example.mainproject.entity.ActionOperationTypeEntity;
import com.example.mainproject.repository.ActionOperationTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionOperationTypeService {

    @Autowired
    private ActionOperationTypeRepo actionOperationTypeRepo;

    public ActionOperationTypeEntity addData(ActionOperationTypeEntity actionOperationType) {
        return actionOperationTypeRepo.save(actionOperationType);
    }

    public ActionOperationTypeEntity getOne(Long id){
        ActionOperationTypeEntity actionOperationType = actionOperationTypeRepo.findById(id).get();
        return actionOperationType;
    }

    public Long deleteOne(Long id) {
        ActionOperationTypeEntity actionOperationType = actionOperationTypeRepo.findById(id).get();
        actionOperationTypeRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, ActionOperationTypeEntity actionOperationType) {
        ActionOperationTypeEntity entity = actionOperationTypeRepo.findById(id).get();
        entity.setAction_oper_type_name(actionOperationType.getAction_oper_type_name());
        entity.setAction_oper_type_name(actionOperationType.getAction_oper_type_name());
        actionOperationTypeRepo.save(entity);
        return id;
    }
}
