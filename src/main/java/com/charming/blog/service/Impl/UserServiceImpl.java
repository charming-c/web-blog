package com.charming.blog.service.Impl;

import com.charming.blog.dao.UserDao;
import com.charming.blog.entity.User;
import com.charming.blog.service.UserService;
import com.charming.blog.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findUserByUsernameAndPassword(username, MD5Util.Encode(password));
        return user;
    }
}
