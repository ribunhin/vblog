package com.webbleen.service;

import com.webbleen.entity.User;

public interface UserService {

    User getById(Long id);

    User checkUser(String username, String password);
}
