package com.citi.ordermatching.controller;

import com.citi.ordermatching.domain.User;
import com.citi.ordermatching.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/getUsers")
    @ResponseBody
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @RequestMapping("/login")
    @ResponseBody
    public User userLogin(@RequestParam("username")String username,@RequestParam("password")String password){

        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        User result=userService.userLogin(user);
        if(result!=null){

            return result;
        }else{
            return null;
        }

    }

    @RequestMapping("/register")
    @ResponseBody
    public String userRegister(@RequestParam("username")String username,@RequestParam("password")String password){

        User user=userService.isExist(username);
        if(user!=null){
            return "";
        }else{
              User user1=new User();
              user1.setUsername(username);
              user1.setPassword(password);
              user1.setMoney(500000.00);
             userService.registerUser(user1);
             return "";
        }
    }
}
