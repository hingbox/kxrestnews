package com.example.news.resp;

/**
 * @ProjectName: news
 * @Package: com.example.news.resp
 * @ClassName: Msg
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 22:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 22:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Msg<T> {
    /*错误码*/
    private Integer code;

    /*提示信息 */
    private String msg;

    /*具体内容*/
    private  T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}