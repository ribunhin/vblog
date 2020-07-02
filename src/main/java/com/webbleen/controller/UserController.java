package com.webbleen.controller;


import com.webbleen.common.lang.Result;
import com.webbleen.entity.User;
import com.webbleen.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author webbleen
 * @since 2020-06-29
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id) {
        return Result.succ(userService.getById(id));
    }


    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.succ(user);
    }

}
