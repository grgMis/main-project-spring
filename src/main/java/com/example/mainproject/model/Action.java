package com.example.mainproject.model;

import com.example.mainproject.entity.ActionEntity;
import com.example.mainproject.entity.ActionTypeEntity;
import com.example.mainproject.entity.WellEntity;

import java.util.Date;

public class Action {
    private Integer action_id;
    private ActionTypeEntity action_type_id;
    private WellEntity well_id;
    private Date action_date_begin;
    private Date action_date_end;

    public static Action toModel(ActionEntity entity){
        Action model = new Action();
        model.setAction_id(entity.getAction_id());
        model.setAction_type_id(entity.getAction_type_id());
        model.setWell_id(entity.getWell_id());
        model.setAction_date_begin(entity.getAction_date_begin());
        model.setAction_date_end(entity.getAction_date_end());
        return model;
    }

    public Action() {
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
