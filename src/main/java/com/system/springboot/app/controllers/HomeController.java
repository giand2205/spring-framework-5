package com.system.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home(){
        //return "redirect:/app/index";
        //return "redirect:https://www.google.com.pe";
        return "forward:/app/index";
    }
}
