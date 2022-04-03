package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HolleController {
    @RequestMapping("/t2")
    public String sayHello(Model model){
        model.addAttribute("msg","ss");
        return "hello";
    }
}
