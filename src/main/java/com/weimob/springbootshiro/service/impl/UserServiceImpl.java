package com.weimob.springbootshiro.service.impl;

import com.weimob.springbootshiro.eneity.User;
import com.weimob.springbootshiro.map.UserMapper;
import com.weimob.springbootshiro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByUserName(String name) {
        Integer total = userMapper.total();
        System.out.println(total);

        return userMapper.findByUserName1(name);
    }
}
