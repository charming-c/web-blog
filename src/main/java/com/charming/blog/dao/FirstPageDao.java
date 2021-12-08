package com.charming.blog.dao;

import com.charming.blog.queryvo.FirstPageBlog;
import com.charming.blog.queryvo.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FirstPageDao {

    List<FirstPageBlog> getFirstPageBlog();

    int getBlogCount();

    int getTypeCount();

    UserInfo getUserInfo();

}
