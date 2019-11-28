package com.zlj.edu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zlj
 * @version 1.8
 * @date 2019/11/28 9:44
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public  String login(){
        System.out.println("login");
        return null;
    }

}
