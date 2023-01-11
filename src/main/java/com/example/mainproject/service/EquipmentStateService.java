package com.example.mainproject.service;

import com.example.mainproject.entity.DeptEntity;
import com.example.mainproject.entity.EquipmentStateEntity;
import com.example.mainproject.repository.EquipmentStateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentStateService {

    @Autowired
    private EquipmentStateRepo equipmentStateRepo;

    public List<EquipmentStateEntity> getAll() {
        return (List<EquipmentStateEntity>) equipmentStateRepo.findAll();
    }

    public EquipmentStateEntity addData(EquipmentStateEntity equipmentState) {
        return equipmentStateRepo.save(equipmentState);
    }

    public EquipmentStateEntity getOne(Long id){
        EquipmentStateEntity equipmentState = equipmentStateRepo.findById(id).get();
        return equipmentState;
    }

    public Long deleteOne(Long id) {
        EquipmentStateEntity equipmentState = equipmentStateRepo.findById(id).get();
        equipmentStateRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, EquipmentStateEntity equipmentState) {
        EquipmentStateEntity entity = equipmentStateRepo.findById(id).get();
        entity.setEquip_state_name(equipmentState.getEquip_state_name());
        entity.setEquip_state_sname(equipmentState.getEquip_state_sname());
        equipmentStateRepo.save(entity);
        return id;
    }
}
