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
@Table(name = "tachers")
public class TeacherDetail extends MasterEntity {

    @Column(name = "student_name")
    private String name;
    @Column(name = "teacher_roll")
    private String roll;
    @Column(name = "teacher_phone")
    private String phone;
    @Column(name = "teacher_address")
    private String address;

    @Column(name = "status")
    private boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
