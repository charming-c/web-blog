package com.charming.blog.service;

import com.charming.blog.queryvo.FirstPageBlog;
import com.charming.blog.queryvo.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FirstPageService {

    List<FirstPageBlog> getFirstPageBlog();
    int getTypeCount();
    int getBlogCount();
    UserInfo getUserInfo();
}
