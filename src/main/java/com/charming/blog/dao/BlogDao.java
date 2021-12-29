package com.charming.blog.dao;

import com.charming.blog.queryvo.BlogInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BlogDao {

    int submit(BlogInfo blogInfo);

}
