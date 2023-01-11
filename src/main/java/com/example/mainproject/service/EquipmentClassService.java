package com.example.mainproject.service;

import com.example.mainproject.entity.DeptEntity;
import com.example.mainproject.entity.EquipmentCategoryEntity;
import com.example.mainproject.entity.EquipmentClassEntity;
import com.example.mainproject.repository.EquipmentCategoryRepo;
import com.example.mainproject.repository.EquipmentClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentClassService {

    @Autowired
    private EquipmentClassRepo equipmentClassRepo;

    @Autowired
    private EquipmentCategoryRepo equipmentCategoryRepo;

    public List<EquipmentClassEntity> getAll() {
        return (List<EquipmentClassEntity>) equipmentClassRepo.findAll();
    }

    public EquipmentClassEntity createData(EquipmentClassEntity equipmentClass, Long id){
        EquipmentCategoryEntity equipmentCategory = equipmentCategoryRepo.findById(id).get();
        equipmentClass.setEquip_category_id(equipmentCategory);
        return equipmentClassRepo.save(equipmentClass);
    }

    public EquipmentClassEntity getOne(Long id) {
        EquipmentClassEntity equipmentClass = equipmentClassRepo.findById(id).get();
        return equipmentClass;
    }

    public Long deleteOne(Long id){
        equipmentClassRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, EquipmentClassEntity equipmentClass) {
        EquipmentClassEntity entity = equipmentClassRepo.findById(id).get();
        entity.setEquip_class_name(equipmentClass.getEquip_class_name());
        entity.setEquip_class_sname(equipmentClass.getEquip_class_sname());
        equipmentClassRepo.save(entity);
        return id;
    }
}
