package com.song.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author song
 * @version 1.0
 * Create by 2022/8/3 9:23
 */
@Controller
public class UserCintroller {
    @RequestMapping("/save")
    @ResponseBody
     public String save(){
         System.out.println("user save");
         return "{user save}";
     }
}
