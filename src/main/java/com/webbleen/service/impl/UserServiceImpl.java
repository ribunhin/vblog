package com.webbleen.service.impl;

import com.webbleen.entity.User;
import com.webbleen.mapper.UserMapper;
import com.webbleen.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
