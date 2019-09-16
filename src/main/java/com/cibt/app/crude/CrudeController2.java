/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.crude;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author user
 */

public abstract class CrudeController2<T> {
    protected String uri,viewpath;
    
    @Autowired
    private JpaRepository<T, Integer> repository;
    
    
    
     @PostMapping()
    public String save(T model) {
        repository.save(model);
        return "redirect:/" + uri;

    }
     @GetMapping
    public String index(Model Model) {
        Model.addAttribute("record", repository.findAll());
        return viewpath + "/index";
    }

    @GetMapping(value = "/create")
    public String create(Model model) {
        return viewpath + "/create";
    }

}