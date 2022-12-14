package com.site.blog.my.core.dao;

import com.site.blog.my.core.entity.BlogLink;
import com.site.blog.my.core.util.PageQueryUtil;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;



/**
 * @author: 公杰
 * @Project: JavaLaity
 */
@Mapper
public interface BlogLinkMapper {
    int deleteByPrimaryKey(Integer linkId);

    int insert(BlogLink record);

    int insertSelective(BlogLink record);

    BlogLink selectByPrimaryKey(Integer linkId);

    int updateByPrimaryKeySelective(BlogLink record);

    int updateByPrimaryKey(BlogLink record);

    List<BlogLink> findLinkList(PageQueryUtil pageUtil);

    int getTotalLinks(PageQueryUtil pageUtil);

    int deleteBatch(Integer[] ids);
}