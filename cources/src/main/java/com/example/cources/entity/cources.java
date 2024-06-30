package com.example.cources.entity;

import jakarta.persistence.*;

@Table
@Entity(name="cources")
public class cources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    int id;

    @Column(name = "cname")
    String cname;

    @Column(name = "teacher")
    String teacher;

    @Column(name = "emp_id")
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
