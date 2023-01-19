package com.example.mainproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ActionTypeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long action_type_id;

    @ManyToOne
    @JoinColumn(name = "action_group_id", nullable = false)
    private ActionGroupEntity action_group_id;

    @Column(nullable = false, length = 40)
    private String action_type_name;

    @Column(nullable = true, length = 20)
    private String action_type_sname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "action_type_id")
    private List<ActionEntity> actionEntityList;

    public ActionTypeEntity() {
    }

    public Long getAction_type_id() {
        return action_type_id;
    }

    public void setAction_type_id(Long action_type_id) {
        this.action_type_id = action_type_id;
    }

    public ActionGroupEntity getAction_group_id() {
        return action_group_id;
    }

    public void setAction_group_id(ActionGroupEntity action_group_id) {
        this.action_group_id = action_group_id;
    }

    public String getAction_type_name() {
        return action_type_name;
    }

    public void setAction_type_name(String action_type_name) {
        this.action_type_name = action_type_name;
    }

    public String getAction_type_sname() {
        return action_type_sname;
    }

    public void setAction_type_sname(String action_type_sname) {
        this.action_type_sname = action_type_sname;
    }
}
