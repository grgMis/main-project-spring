package com.example.mainproject.service;

import com.example.mainproject.entity.EquipmentCategoryEntity;
import com.example.mainproject.repository.EquipmentCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipmentCategoryService {

    @Autowired
    private EquipmentCategoryRepo equipmentCategoryRepo;

    public EquipmentCategoryEntity createData(EquipmentCategoryEntity equipmentCategory) {
        return equipmentCategoryRepo.save(equipmentCategory);
    }

    public EquipmentCategoryEntity getOne(Long id) {
        EquipmentCategoryEntity equipmentCategory = equipmentCategoryRepo.findById(id).get();
        return equipmentCategory;
    }

    public Long deleteOne(Long id){
        equipmentCategoryRepo.deleteById(id);
        return id;
    }

    public Long updateData(Long id, EquipmentCategoryEntity equipmentCategory) {
        EquipmentCategoryEntity entity = equipmentCategoryRepo.findById(id).get();
        entity.setEquip_category_name(equipmentCategory.getEquip_category_name());
        entity.setEquip_category_sname(equipmentCategory.getEquip_category_sname());
        equipmentCategoryRepo.save(entity);
        return id;
    }
}
