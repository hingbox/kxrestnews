package com.example.news.service.impl;

import com.example.news.bean.NewsInfo;
import com.example.news.dao.NewsDao;
import com.example.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: news
 * @Package: com.example.news.service.impl
 * @ClassName: NewsServiceImpl
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 21:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 21:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class NewsServiceImpl implements INewsService {
    //引入dao层接口
    @Autowired
    private NewsDao newsDao;

    @Override
    @Cacheable(value = "news", key = "#title")
    public List<NewsInfo> getNewsList(String title) {
        System.out.println( "从数据库读取，而非读取缓存！" );
        return newsDao.getNewsList(title);
    }
}