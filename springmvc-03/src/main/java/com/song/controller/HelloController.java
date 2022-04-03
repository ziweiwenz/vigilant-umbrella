package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(Model model){
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";
    }
}
