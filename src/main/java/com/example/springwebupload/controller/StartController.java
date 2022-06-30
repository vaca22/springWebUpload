package com.example.springwebupload.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

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



    @ResponseBody
    @PostMapping("/update")
    public String hello2(MultipartFile file) throws IOException {
        if(file.isEmpty()){
            System.out.println("fuck");
        }


        String name="yi.apk";
        String name2=name;
        File myObj = new File(name2);

        if(myObj.exists()){
            myObj.delete();
        }

        file.transferTo(myObj.getAbsoluteFile());
        System.out.println(myObj.getAbsolutePath()+"  "+  file.getOriginalFilename());
        return "Hello W22orld!";
    }
}
