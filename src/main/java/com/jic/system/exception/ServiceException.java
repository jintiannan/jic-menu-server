package com.jic.system.exception;

/**
 * Created by lvcn on 2019-7-17.
 * Service层异常处理类
 */
public class ServiceException extends BaseException {


    public ServiceException(String msg) {
        super(msg);
    }

    public ServiceException(String code, String msg) {
        super(code, msg);
    }
}
