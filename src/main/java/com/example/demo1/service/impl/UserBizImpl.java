package com.example.demo1.service.impl;

import com.example.demo1.dao.UserDao;
import com.example.demo1.entity.UserEntity;
import com.example.demo1.service.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBizImpl implements UserBiz {


    private final UserDao userDao;

    @Autowired
    public UserBizImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserEntity login(UserEntity user) {

        UserEntity userEntity = userDao.getUserByName(user);

        if (userEntity != null && user.getUser_pass().equals(userEntity.getUser_pass())) {
            return userEntity;
        }
        return null;
    }
}
