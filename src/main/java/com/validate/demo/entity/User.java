package com.validate.demo.entity;

import com.validate.demo.constant.ValidatePatternConstants;
import com.validate.demo.entity.user.UserGroup;
import com.validate.demo.validate.DateTime;

import javax.validation.constraints.*;
import java.util.Date;

public class User {

    /**
     * 用户账号
     * groups 进行分组校验
     */
    @NotNull(message = "用户账号不能为空！", groups = UserGroup.addUser.class)
    @Size(min = 5, max = 15, message = "用户账号长度必须在5到15之间", groups = UserGroup.addUser.class)
    private String userName;

    /**
     * 用户名称
     */
    @NotBlank(message = "用户名称不能为空" ,groups = {UserGroup.addUser.class, UserGroup.updateUser.class})
    private String nickName;

    /**
     * 用户年龄
     */
    @Max(value = 100,message = "用户年龄最大值不能超过150岁",groups = {UserGroup.addUser.class, UserGroup.updateUser.class})
    @Min(value = 1,message = "用户年龄最小值不能低于1岁",groups = {UserGroup.addUser.class, UserGroup.updateUser.class})
    private int age;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户出生日期
     */
    @DateTime(format = "yyyy-MM-dd", message = "格式错误，正确格式为：yyyy-MM-dd")
    private String birthDate;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
