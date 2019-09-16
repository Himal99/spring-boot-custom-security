/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;

import com.cibt.app.crude.CrudeController;
import com.cibt.app.entity.StudentsDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/students")
public class StudentController extends CrudeController<StudentsDetails>{
    
    public StudentController(){
        this.uri="students";
        this.viewpath="students";
    }
    
}
