package com.citi.ordermatching.serviceImpl;

import com.citi.ordermatching.dao.UserMapper;
import com.citi.ordermatching.domain.User;
import com.citi.ordermatching.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dell on 2018/8/12.
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUsers() {

        return userMapper.finAllUsers();
    }
}
