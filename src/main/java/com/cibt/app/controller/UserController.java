/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;


import com.cibt.app.crude.CrudeController2;
import com.cibt.app.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/users")
public class UserController extends CrudeController2<User>{
    
    public UserController(){
        this.uri="users";
        this.viewpath="users";
    }
    
}
