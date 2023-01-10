package com.example.mainproject.service;

import com.example.mainproject.entity.DeptEntity;
import com.example.mainproject.entity.EquipmentCategoryEntity;
import com.example.mainproject.entity.EquipmentClassEntity;
import com.example.mainproject.entity.WellEntity;
import com.example.mainproject.repository.DeptRepo;
import com.example.mainproject.repository.WellRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WellService {

    @Autowired
    private WellRepo wellRepo;

    @Autowired
    private DeptRepo deptRepo;

    public WellEntity createData(WellEntity wellEntity, Integer id){
        DeptEntity deptEntity = deptRepo.findById(id).get();
        wellEntity.setDept_id(deptEntity);
        return wellRepo.save(wellEntity);
    }

    public WellEntity getOne(Integer id) {
        WellEntity wellEntity = wellRepo.findById(id).get();
        return wellEntity;
    }

    public Integer deleteOne(Integer id){
        wellRepo.deleteById(id);
        return id;
    }

    public Integer updateData(Integer id, WellEntity wellEntity) {
        WellEntity entity = wellRepo.findById(id).get();
        entity.setWell_name(wellEntity.getWell_name());
        wellRepo.save(entity);
        return id;
    }
}
