package com.southwind.controller;

import com.southwind.entity.User;
import com.southwind.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("test")
public class UserController {
    @Autowired
    private UserService userService;
    public User findById(Integer id){
        return userService.findById(id);
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
