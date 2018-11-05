package com.example.news.dao;

import com.example.news.bean.NewsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ProjectName: news
 * @Package: com.example.news.dao
 * @ClassName: NewsDao
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 21:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 21:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Mapper
@Repository
public interface NewsDao {
    @Select("SELECT * FROM news WHERE title like CONCAT('%',#{title},'%')")
    List<NewsInfo> getNewsList(@Param("title") String title);
}