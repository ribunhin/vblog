package com.webbleen.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("w_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String avatar;

    private LocalDateTime birthday;

    private LocalDateTime createTime;

    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    private String gender;

    private String password;

    private String brief;

    private String phone;

    private String nickname;

    private Integer type;

    private LocalDateTime updateTime;

    @NotBlank(message = "昵称不能为空")
    private String username;


}
