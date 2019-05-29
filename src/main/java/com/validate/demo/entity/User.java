package com.validate.demo.entity;

import com.validate.demo.constant.ValidatePatternConstants;
import com.validate.demo.entity.user.UserGroup;
import com.validate.demo.validate.DateTime;

import javax.validation.constraints.*;

/**
 * @author linzf
 * @since 2019-05-29
 * 类描述：用户的实体类
 */
public class User {

    /**
     * 用户账号
     * groups 进行分组校验
     */
    @NotBlank(message = "用户账号不能为空！", groups = UserGroup.AddUser.class)
    @Size(min = 5, max = 15, message = "用户账号长度必须在5到15之间", groups = UserGroup.AddUser.class)
    private String userName;

    /**
     * 用户名称
     */
    @NotBlank(message = "用户名称不能为空", groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    private String nickName;

    /**
     * 用户年龄
     */
    @Max(value = 100, message = "用户年龄最大值不能超过150岁", groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    @Min(value = 1, message = "用户年龄最小值不能低于1岁", groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    private int age;

    /**
     * 用户邮箱
     */
    @Email(message = "邮箱格式错误",groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    private String email;

    /**
     * 手机号码的验证
     */
    @Pattern(regexp = ValidatePatternConstants.PHONE_VALIDATE, message = "手机号码格式错误",groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    @NotBlank(message = "手机号码不能为空",groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    private String phone;

    /**
     * 用户出生日期
     */
    @DateTime(format = "yyyy-MM-dd", message = "格式错误，正确格式为：yyyy-MM-dd",groups = {UserGroup.AddUser.class, UserGroup.UpdateUser.class})
    private String birthDate;

    /**
     * 不再组里的字段的验证
     */
    @NotBlank(message = "移动手机号码不能为空")
    private String telephone;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

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
