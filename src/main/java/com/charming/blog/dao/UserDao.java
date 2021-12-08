package com.charming.blog.dao;

import com.charming.blog.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    User findUserByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
