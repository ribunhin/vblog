package com.webbleen.dao;

import com.webbleen.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    User getById(@Param("id") Long id);

    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
