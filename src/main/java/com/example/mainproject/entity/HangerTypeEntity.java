package com.example.mainproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class HangerTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hanger_type_id;

    @Column(nullable = false, length = 20)
    private String hanger_type_name;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hanger_type_id")
=======
    @OneToMany(mappedBy = "hanger_type_id")
>>>>>>> parent of 31311a4 (create models)
    private List<ActionOperationEntity> actionOperationEntityList;

    public HangerTypeEntity() {
    }

    public Long getHanger_type_id() {
        return hanger_type_id;
    }

    public void setHanger_type_id(Long hanger_type_id) {
        this.hanger_type_id = hanger_type_id;
    }

    public String getHanger_type_name() {
        return hanger_type_name;
    }

    public void setHanger_type_name(String hanger_type_name) {
        this.hanger_type_name = hanger_type_name;
    }
}
