package com.charming.blog.service.Impl;

import com.charming.blog.dao.FirstPageDao;
import com.charming.blog.queryvo.FirstPageBlog;
import com.charming.blog.queryvo.TypeInfo;
import com.charming.blog.queryvo.UserInfo;
import com.charming.blog.service.FirstPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstPageServiceImpl implements FirstPageService {
    @Autowired
    FirstPageDao firstPageDao;

    @Override
    public List<FirstPageBlog> getBlogTotal() {
        return firstPageDao.getBlogTotal();
    }

    @Override
    public List<FirstPageBlog> getFirstPageBlog() {
        return firstPageDao.getFirstPageBlog();
    }

    @Override
    public int getTypeCount() {
        return firstPageDao.getTypeCount();
    }

    @Override
    public int getBlogCount() {
        return firstPageDao.getBlogCount();
    }

    @Override
    public UserInfo getUserInfo() {
        return firstPageDao.getUserInfo();
    }

    @Override
    public List<TypeInfo> getTypeList() {
        return firstPageDao.getTypeList();
    }
}
