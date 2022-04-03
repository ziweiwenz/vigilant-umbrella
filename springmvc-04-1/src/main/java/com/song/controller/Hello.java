package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Hello {
    @RequestMapping("/hello/{p1}" )
    //@PathVariable String p1获取url值
    public String sayHello(@PathVariable String p1, Model model){
        String result=p1;
        model.addAttribute("msg","hello,SpringMVC"+result);
        return "hello";
    }
}
