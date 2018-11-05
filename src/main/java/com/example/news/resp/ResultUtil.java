package com.example.news.resp;

/**
 * @ProjectName: news
 * @Package: com.example.news.resp
 * @ClassName: ResultUtil
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 22:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 22:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ResultUtil {
    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static Msg success(Object object){
        Msg msg=new Msg();
        msg.setCode(200);
        msg.setMsg("请求成功");
        msg.setData(object);
        return msg;
    }
    public static Msg success(){
        return success(null);
    }

    public static Msg error(Integer code,String resultmsg){
        Msg msg=new Msg();
        msg.setCode(code);
        msg.setMsg(resultmsg);
        return msg;
    }
}