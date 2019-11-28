package com.zlj.edu.web.controller;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import com.zlj.edu.model.User;
import com.zlj.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public  String login(){
        System.out.println("login");
        return "default";
    }

    @RequestMapping("find")
    public  String find(Integer id){
        System.out.println("find");
        User user=userService.findById(id);
        System.out.println(user);
        return null;
    }

    @RequestMapping("manage")
    public  String manage(){
        return "User/UserManage";
    }

    @RequestMapping("info")
    public  String info(){
        return "User/UserInfo";
    }

    @RequestMapping("edit")
    public  String edit(){
        return "User/UserEdit";
    }

}
