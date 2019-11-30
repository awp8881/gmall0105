package com.chengdu.gmall.user.controller;


import com.chengdu.gmall.user.bean.UmsMember;
import com.chengdu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }



    @RequestMapping("index")
    public String index(){

        return "hello";
    }


}
