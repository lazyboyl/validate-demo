package com.validate.demo.controller;

import com.validate.demo.entity.User;
import com.validate.demo.entity.user.UserGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Size;

/**
 * @author linzf
 * @since 2019-05-29
 * 类描述：用户的controller类
 */
@RestController
@Validated
public class UserController {

    @PostMapping("addUser")
    public String addUser(@Validated({UserGroup.AddUser.class}) @RequestBody User entity) {
        return entity.getUserName();
    }

    @PostMapping("updateUser")
    public String updateUser(@Validated({UserGroup.UpdateUser.class}) @RequestBody User entity) {
        return entity.getUserName();
    }


    @PostMapping("noValidate")
    public String noValidate(@RequestBody User entity){
        return entity.getUserName();
    }

    @PostMapping("deleteUser")
    public String deleteUser(@Size(min = 5, max = 15, message = "用户账号长度必须在5到15之间") @RequestParam("userName") String userName) {
        return userName;
    }

}
