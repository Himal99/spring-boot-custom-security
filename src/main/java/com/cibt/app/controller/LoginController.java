/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;

import com.cibt.app.entity.User;
import com.cibt.app.repositiry.UserRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
    
    @Autowired
    private UserRepositiry UserRepositiry;
    
    @GetMapping
    public String index(){
        return "login/index";
    }
    
    @PostMapping
    public String login(@RequestParam("username")String username,
            @RequestParam("password") String password){
        User user=UserRepositiry
                .findByUsernameAndPassword(username, password);
        if(user!=null){
            return "redirect:/teachers";
        }
        return "redirect:/login?error";
        
        
        
        
        
        
        
        
        
    }
    
}
