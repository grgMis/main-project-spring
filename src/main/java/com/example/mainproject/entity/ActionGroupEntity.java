package com.example.mainproject.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.IndexColumn;

import java.util.List;

@Entity
public class ActionGroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long action_group_id;

    @Column(nullable = false, length = 40)
    private String action_group_name;

    @Column(nullable = true, length = 20)
    private String action_group_sname;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "action_group_id")
=======
    @OneToMany(mappedBy = "action_group_id")
>>>>>>> parent of 31311a4 (create models)
    private List<ActionTypeEntity> actionTypeEntitiesList;

    public ActionGroupEntity() {
    }

    public Long getAction_group_id() {
        return action_group_id;
    }

    public void setAction_group_id(Long action_group_id) {
        this.action_group_id = action_group_id;
    }

    public String getAction_group_name() {
        return action_group_name;
    }

    public void setAction_group_name(String action_group_name) {
        this.action_group_name = action_group_name;
    }

    public String getAction_group_sname() {
        return action_group_sname;
    }

    public void setAction_group_sname(String action_group_sname) {
        this.action_group_sname = action_group_sname;
    }
}
