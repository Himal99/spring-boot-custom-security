/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.app.controller;

import com.cibt.app.entity.User;
import com.cibt.app.entity.Userprofile;
import com.cibt.app.repositiry.UserRepositiry;
import com.cibt.app.repositiry.UserprofileRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author user
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private UserRepositiry repositiry;
    
    @Autowired
    private UserprofileRepositiry profileRepositiry;

    @GetMapping
    public String index() {
        return "register/index";
    }

    @PostMapping(value = "/checkuser")
    @ResponseBody
    public boolean checkUSer(@RequestParam("value") String value) {
        if (repositiry.findByusername(value) == null) {
            return false;
        }
        return true;
    }
     @PostMapping(value = "/checkemail")
    @ResponseBody
    public boolean checkEmail(@RequestParam("value") String value) {
        if (repositiry.findByemail(value) == null) {
            return false;
        }
        return true;
    }
    
    @PostMapping()
    
    public String Save(@ModelAttribute("user")User user){
        repositiry.save(user);
        Userprofile profile= new Userprofile();
        profile.setUser(user);
        profileRepositiry.save(profile);
        return "redirect:/login";
    }
}
