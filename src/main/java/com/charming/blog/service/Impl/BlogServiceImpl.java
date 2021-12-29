package com.charming.blog.service.Impl;

import com.charming.blog.dao.BlogDao;
import com.charming.blog.queryvo.BlogInfo;
import com.charming.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogDao blogDao;

    @Override
    public int submit(BlogInfo blogInfo) {
        return blogDao.submit(blogInfo);
    }
}
