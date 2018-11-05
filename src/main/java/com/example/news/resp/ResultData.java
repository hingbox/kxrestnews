package com.example.news.resp;

/**
 * @ProjectName: news
 * @Package: com.example.news.bean
 * @ClassName: NewsInfo
 * @Description: java类作用描述
 * @Author: hingbox@163.com
 * @CreateDate: 2018/11/4 21:03
 * @UpdateUser: 更新者
 * @UpdateDate: 2018/11/4 21:03
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ResultData {
    /**
     * 错误码，对应{@link }，表示一种错误类型
     * 如果是成功，则code为200
     */
    private int code;
    /**
     * 对错误的具体解释
     */
    private String message;
    /**
     * 返回的结果包装在value中，value可以是单个对象
     */
    private Object value;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}