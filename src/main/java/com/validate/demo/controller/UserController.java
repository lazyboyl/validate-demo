package com.validate.demo.controller;

import com.validate.demo.entity.User;
import com.validate.demo.entity.user.UserGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("addUser")
    public String addUser(@Validated({UserGroup.addUser.class}) @RequestBody User entity) {
        return entity.getUserName();
    }

}
