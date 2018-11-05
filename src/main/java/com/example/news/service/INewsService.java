package com.example.news.service;

import com.example.news.bean.NewsInfo;

import java.util.List;

/**
 * @ProjectName: news
 * @Package: com.example.news.service
 * @ClassName: INewsService
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 21:08
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 21:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface INewsService {
    public List<NewsInfo> getNewsList(String username);
}