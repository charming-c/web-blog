package com.charming.blog.service;

import com.charming.blog.entity.User;

public interface UserService {

    //核对用户名和密码
    User checkUser(String username, String password);
}
