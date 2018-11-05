package com.example.news.controller;

import com.example.news.bean.NewsInfo;
import com.example.news.resp.Msg;
import com.example.news.resp.ResultUtil;
import com.example.news.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: news
 * @Package: com.example.news.controller
 * @ClassName: NewsController
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 21:04
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 21:04
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@RestController
@ComponentScan(basePackages={"com.example.demo.service"})//添加的注解
public class NewsController {

    @Autowired
    private INewsService newsService;
    @RequestMapping(value="/news",method = {RequestMethod.POST,RequestMethod.GET},produces = "application/json;charset=UTF-8")
    public Msg getAdInfo(@RequestBody Map<String,Object> reqMap){
        String title = reqMap.get("title").toString();
        if (StringUtils.isEmpty(title)) {
            return ResultUtil.error(201,"关键字不能为空");
        }
        List<NewsInfo> list = newsService.getNewsList(title);
        return ResultUtil.success(list);
    }

}