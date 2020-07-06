package com.webbleen.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class User {

    private Long id;

    private Integer type;
    @NotBlank(message = "标题不能为空")
    private String username;
    private String nickname;
    private String password;
    private String phone;
    private String gender;
    private Date birthday;
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;
    private String avatar;
    private String brief;
    private Date createTime;
    private Date updateTime;

}
