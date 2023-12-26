package com.slow.springbootmall.service;

import com.slow.springbootmall.dto.UserRegisterRequest;
import com.slow.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

}
