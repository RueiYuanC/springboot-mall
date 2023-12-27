package com.slow.springbootmall.dao;

import com.slow.springbootmall.dto.UserRegisterRequest;
import com.slow.springbootmall.model.User;

public interface UserDao {
    User getUserByEmail(String email);
    User getUserById(Integer userId);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
