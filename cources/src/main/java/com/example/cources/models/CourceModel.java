package com.example.cources.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CourceModel {

    int id;

    String cname;

    String teacher;

    int emp_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }



}
