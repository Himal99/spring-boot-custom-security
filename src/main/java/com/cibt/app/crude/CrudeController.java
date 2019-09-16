/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.crude;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */

public abstract class CrudeController<T> {
    protected String uri,viewpath;
    
    @Autowired
    private JpaRepository<T, Long> repository;
    
    
    
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

    @GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {

        model.addAttribute("record", repository.findById(id).get());

        return viewpath + "/edit";
    }
    @GetMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        repository.deleteById(id);
        return "redirect:/"+uri +"?success";

    }
    
    @GetMapping(value="/json")
    @ResponseBody
    public List<T> json(){
        return repository.findAll();
    }
    
    @GetMapping(value="/json/{id}")
    @ResponseBody
    public T jsonById(@PathVariable("id")long id){
        return repository.findById(id).get();
    }
    
}
