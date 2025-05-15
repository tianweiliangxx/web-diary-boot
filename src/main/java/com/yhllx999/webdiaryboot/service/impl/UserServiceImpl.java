package com.yhllx999.webdiaryboot.service.impl;

import com.yhllx999.webdiaryboot.entity.User;
import com.yhllx999.webdiaryboot.mapper.UserMapper;
import com.yhllx999.webdiaryboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.findById(id);
    }
}
