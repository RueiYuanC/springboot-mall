package com.slow.springbootmall.service.impl;

import com.slow.springbootmall.dao.UserDao;
import com.slow.springbootmall.dto.UserRegisterRequest;
import com.slow.springbootmall.model.User;
import com.slow.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
