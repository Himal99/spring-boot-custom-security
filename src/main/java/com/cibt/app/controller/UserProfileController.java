/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;


import com.cibt.app.crude.CrudeController2;
import com.cibt.app.entity.Userprofile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/userprofile")
public class UserProfileController extends CrudeController2<Userprofile>{
    
    public UserProfileController(){
        this.uri="profile";
        this.viewpath="profile";
    }
}
