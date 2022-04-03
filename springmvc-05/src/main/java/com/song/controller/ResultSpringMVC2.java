package com.song.controller;

import com.song.doa.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ResultSpringMVC2 {
    @RequestMapping("/rsm2/t1")
    public  String test(){

        return "test";
    }
    @RequestMapping("rsm2/t2")
    public String test1(){
        return "redirect:/index.jsp";
    }
/*    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println(name);
        return "hello";
    }*/
    @RequestMapping("/hello")
    public String hello(@RequestParam("username") String name){
        System.out.println(name);
        return "hello";
    }
    @RequestMapping("user")
    public String user(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user.toString());
        return "hello";
    }
}
