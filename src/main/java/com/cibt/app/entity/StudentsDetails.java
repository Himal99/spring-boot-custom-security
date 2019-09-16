/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author user
 */
@Entity
@Table(name = "student_detail")
public class StudentsDetails extends MasterEntity{
    
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_roll")
    private String rolno;
    @Column(name = "student_address")
    private String address;
    @Column(name = "student_phone")
    private String phone;
    @Column(name = "student_grade")
    private String grade;
    @Column(name = "gender")
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolno() {
        return rolno;
    }

    public void setRolno(String rolno) {
        this.rolno = rolno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Column(name = "status")
    private String status;
    
    
    
    
    
    
    
    
    
}
