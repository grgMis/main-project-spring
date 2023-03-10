package com.example.mainproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class EquipmentClassEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equip_class_id;
    @ManyToOne
    @JoinColumn(name = "equip_category_id", nullable = false)
    private EquipmentCategoryEntity equip_category_id;

    @Column(nullable = false, length = 40)
    private String equip_class_name;

    @Column(nullable = true, length = 20)
    private String equip_class_sname;

<<<<<<< HEAD
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equip_class_id")
=======
    @OneToMany(mappedBy = "equip_class_id")
>>>>>>> parent of 31311a4 (create models)
    private List<EquipmentModelEntity> equipmentModelEntityList;

    @OneToMany(mappedBy = "equip_class_id")
    private List<ActionEquipmentEntity> actionEquipmentEntityList;

    public EquipmentClassEntity() {
    }

    public Long getEquip_class_id() {
        return equip_class_id;
    }

    public void setEquip_class_id(Long equip_class_id) {
        this.equip_class_id = equip_class_id;
    }

    public EquipmentCategoryEntity getEquip_category_id() {
        return equip_category_id;
    }

    public void setEquip_category_id(EquipmentCategoryEntity equip_category_id) {
        this.equip_category_id = equip_category_id;
    }

    public String getEquip_class_name() {
        return equip_class_name;
    }

    public void setEquip_class_name(String equip_class_name) {
        this.equip_class_name = equip_class_name;
    }

    public String getEquip_class_sname() {
        return equip_class_sname;
    }

    public void setEquip_class_sname(String equip_class_sname) {
        this.equip_class_sname = equip_class_sname;
    }
}