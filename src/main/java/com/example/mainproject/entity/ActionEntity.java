package com.example.mainproject.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class ActionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer action_id;

    @ManyToOne
    @JoinColumn(name = "action_type_id", nullable = false)
    private ActionTypeEntity action_type_id;

    @ManyToOne
    @JoinColumn(name = "well_id", nullable = false)
    private WellEntity well_id;

    @Column(nullable = false)
    private Date action_date_begin;

    @Column(nullable = true)
    private Date action_date_end;

    @OneToMany(mappedBy = "action_id")
    private List<ActionOperationEntity> actionOperationEntityList;

    public ActionEntity() {
    }

    public Integer getAction_id() {
        return action_id;
    }

    public void setAction_id(Integer action_id) {
        this.action_id = action_id;
    }

    public ActionTypeEntity getAction_type_id() {
        return action_type_id;
    }

    public void setAction_type_id(ActionTypeEntity action_type_id) {
        this.action_type_id = action_type_id;
    }

    public WellEntity getWell_id() {
        return well_id;
    }

    public void setWell_id(WellEntity well_id) {
        this.well_id = well_id;
    }

    public Date getAction_date_begin() {
        return action_date_begin;
    }

    public void setAction_date_begin(Date action_date_begin) {
        this.action_date_begin = action_date_begin;
    }

    public Date getAction_date_end() {
        return action_date_end;
    }

    public void setAction_date_end(Date action_date_end) {
        this.action_date_end = action_date_end;
    }
}
