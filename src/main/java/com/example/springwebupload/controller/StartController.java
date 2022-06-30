package com.example.springwebupload.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StartController {
    @GetMapping("/serverIndex")
    public ModelAndView hello(){
        return new ModelAndView("index");
    }

    @GetMapping("/")
    public ModelAndView login(){
        return new ModelAndView("login");
    }
}
