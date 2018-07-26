package com.weimob.springbootshiro.service;

import com.weimob.springbootshiro.eneity.User;

public interface UserService {
    public User findByUserName(String name);
}
