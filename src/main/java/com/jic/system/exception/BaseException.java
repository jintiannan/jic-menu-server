package com.jic.system.exception;

/**
 * Created by lvcn on 2019-7-17.
 * 异常处理基础类
 */
public class BaseException extends RuntimeException {

    protected String code;

    public BaseException(String msg){
        super(msg);
    }

    public BaseException(String code,String msg){
        super(msg);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
