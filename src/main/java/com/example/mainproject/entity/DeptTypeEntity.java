package com.example.mainproject.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class DeptTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dept_type_id;

    @Column(nullable = false, length = 40)
    private String dept_type_name;

    @Column(nullable = true, length = 20)
    private String dept_type_sname;

<<<<<<< HEAD
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "dept_type_id")
=======
    @OneToMany(mappedBy = "dept_type_id")
>>>>>>> parent of 31311a4 (create models)
    private List<DeptEntity> deptEntityList;


    public DeptTypeEntity() {
    }

    public Long getDept_type_id() {
        return dept_type_id;
    }

    public void setDept_type_id(Long dept_type_id) {
        this.dept_type_id = dept_type_id;
    }

    public String getDept_type_name() {
        return dept_type_name;
    }

    public void setDept_type_name(String dept_type_name) {
        this.dept_type_name = dept_type_name;
    }

    public String getDept_type_sname() {
        return dept_type_sname;
    }

    public void setDept_type_sname(String dept_type_sname) {
        this.dept_type_sname = dept_type_sname;
    }
}
