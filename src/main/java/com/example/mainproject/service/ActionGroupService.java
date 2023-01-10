package com.example.mainproject.service;

import com.example.mainproject.entity.ActionGroupEntity;
import com.example.mainproject.repository.ActionGroupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionGroupService {

    @Autowired
    private ActionGroupRepo actionGroupRepo;

    public ActionGroupEntity createData(ActionGroupEntity actionGroup) {
        return actionGroupRepo.save(actionGroup);
    }

    public ActionGroupEntity getOne(Long id) {
        ActionGroupEntity actionGroup = actionGroupRepo.findById(id).get();
        return actionGroup;
    }

    public Long deleteOne(Long id){
        actionGroupRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, ActionGroupEntity actionGroup) {
        ActionGroupEntity entity = actionGroupRepo.findById(id).get();
        entity.setAction_group_name(actionGroup.getAction_group_name());
        entity.setAction_group_sname(actionGroup.getAction_group_sname());
        actionGroupRepo.save(entity);
        return id;
    }
}
