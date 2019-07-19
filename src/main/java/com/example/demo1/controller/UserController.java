package com.example.demo1.controller;


import com.example.demo1.entity.UserEntity;
import com.example.demo1.service.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserBiz userBiz;

    @Autowired
    public UserController(UserBiz userBiz) {
        this.userBiz = userBiz;
    }

    @RequestMapping(value="/login.do",method= RequestMethod.POST)
    public Object login(UserEntity user, HttpSession session){
        UserEntity userEntity = userBiz.login(user);
        if (userEntity != null){
            return "Welcome " + userEntity.getUser_name();
        }else{
            return "failure to login";
        }
    }


}
