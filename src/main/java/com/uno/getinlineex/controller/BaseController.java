package com.uno.getinlineex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String root() {
        System.out.println("root~~");
        return "index";
    }
}
