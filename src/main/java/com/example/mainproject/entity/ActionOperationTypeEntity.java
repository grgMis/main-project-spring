package com.example.mainproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ActionOperationTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long action_oper_type_id;

    @Column(nullable = false, length = 40)
    private String action_oper_type_name;

    @Column(nullable = true, length = 20)
    private String action_oper_type_sname;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "action_oper_type_id")
=======
    @OneToMany(mappedBy = "action_oper_type_id")
>>>>>>> parent of 31311a4 (create models)
    private List<ActionOperationEntity> actionOperationEntityList;

    public ActionOperationTypeEntity() {
    }

    public Long getAction_oper_type_id() {
        return action_oper_type_id;
    }

    public void setAction_oper_type_id(Long action_oper_type_id) {
        this.action_oper_type_id = action_oper_type_id;
    }

    public String getAction_oper_type_name() {
        return action_oper_type_name;
    }

    public void setAction_oper_type_name(String action_oper_type_name) {
        this.action_oper_type_name = action_oper_type_name;
    }

    public String getAction_oper_type_sname() {
        return action_oper_type_sname;
    }

    public void setAction_oper_type_sname(String action_oper_type_sname) {
        this.action_oper_type_sname = action_oper_type_sname;
    }
}
