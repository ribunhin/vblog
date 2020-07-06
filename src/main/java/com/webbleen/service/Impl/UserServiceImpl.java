package com.webbleen.service.Impl;

import cn.hutool.crypto.SecureUtil;
import com.webbleen.dao.UserDao;
import com.webbleen.entity.User;
import com.webbleen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getById(Long id) {
        User user = userDao.getById(id);
        return user;
    }

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, SecureUtil.md5(password));
        return user;
    }
}
