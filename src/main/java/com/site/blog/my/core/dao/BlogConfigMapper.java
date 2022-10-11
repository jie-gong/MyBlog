package com.site.blog.my.core.dao;

import com.site.blog.my.core.entity.BlogConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



/**
 * @author: 公杰
 * @Project: JavaLaity
 */
@Mapper
public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}