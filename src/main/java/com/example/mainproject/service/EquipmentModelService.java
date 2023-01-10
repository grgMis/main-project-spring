package com.example.mainproject.service;

import com.example.mainproject.entity.EquipmentCategoryEntity;
import com.example.mainproject.entity.EquipmentClassEntity;
import com.example.mainproject.entity.EquipmentModelEntity;
import com.example.mainproject.repository.EquipmentClassRepo;
import com.example.mainproject.repository.EquipmentModelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentModelService {

    @Autowired
    private EquipmentModelRepo equipmentModelRepo;

    @Autowired
    private EquipmentClassRepo equipmentClassRepo;

    public EquipmentModelEntity createData(EquipmentModelEntity equipmentModel, Long id){
        EquipmentClassEntity equipmentClass = equipmentClassRepo.findById(id).get();
        equipmentModel.setEquip_class_id(equipmentClass);
        return equipmentModelRepo.save(equipmentModel);
    }

    public EquipmentModelEntity getOne(Integer id) {
        EquipmentModelEntity equipmentModel = equipmentModelRepo.findById(id).get();
        return equipmentModel;
    }

    public Integer deleteOne(Integer id){
        equipmentModelRepo.deleteById(id);
        return id;
    }

    public Integer updateData(Integer id, EquipmentModelEntity equipmentModel) {
        EquipmentModelEntity entity = equipmentModelRepo.findById(id).get();
        entity.setEquip_model_name(equipmentModel.getEquip_model_name());
        entity.setEquip_model_sname(equipmentModel.getEquip_model_sname());
        equipmentModelRepo.save(entity);
        return id;
    }
}
