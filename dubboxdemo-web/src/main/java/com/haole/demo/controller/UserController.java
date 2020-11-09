package com.haole.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haole.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Reference//远端注入
    private UserService userService;

    @RequestMapping("/showName")
    @ResponseBody
    public String showName(){

        return userService.getName();
    }
}
