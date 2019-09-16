/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;

import com.cibt.app.crude.CrudeController;
import com.cibt.app.entity.RolesDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/roles")
public class RoleController extends CrudeController<RolesDetails>{
    public  RoleController(){
        this.uri="roles";
        this.viewpath="roles";
    }
}
