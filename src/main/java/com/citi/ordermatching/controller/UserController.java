package com.citi.ordermatching.controller;

import com.alibaba.fastjson.JSON;
import com.citi.ordermatching.domain.User;
import com.citi.ordermatching.service.UserService;
import com.citi.ordermatching.util.TokenProccessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 2018/8/12.
 */
@RestController
@CrossOrigin
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
    public String userLogin(@RequestParam("username")String username,@RequestParam("password")String password){


        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        User result=userService.userLogin(user);
        if(result!=null){
            Map map=new HashMap();
            String token = TokenProccessor.getInstance().makeToken();
            map.put("token",token);
            map.put("result",result);
            String jsonResult= JSON.toJSONString(map);
            return jsonResult;
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
