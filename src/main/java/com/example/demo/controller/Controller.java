package com.example.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String Mainpage(){
        return "index.html";
    }

}
