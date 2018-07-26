package com.weimob.springbootshiro.map;

import com.weimob.springbootshiro.eneity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public User findByUserName(String username);
    User findByUserName1(String username);

    Integer total();
}
