package com.yhllx999.webdiaryboot.controller;

import com.yhllx999.webdiaryboot.entity.User;
import com.yhllx999.webdiaryboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/id")
    public User getById(int id) {
        return userService.getUserById(id);
    }
}
