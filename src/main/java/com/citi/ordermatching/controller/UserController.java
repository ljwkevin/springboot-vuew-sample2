package com.citi.ordermatching.controller;

import com.citi.ordermatching.domain.User;
import com.citi.ordermatching.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Dell on 2018/8/12.
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/getUsers/")
    @ResponseBody
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }
}
