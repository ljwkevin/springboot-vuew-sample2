package com.citi.ordermatching.service;

import com.citi.ordermatching.domain.User;

import java.util.List;

/**
 * Created by Dell on 2018/8/12.
 */
public interface UserService {
    List<User> findAllUsers();
}
