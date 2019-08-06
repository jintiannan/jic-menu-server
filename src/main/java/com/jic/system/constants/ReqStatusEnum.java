package com.jic.system.constants;

import com.jic.system.base.BaseEnum;

/**
 * Created by lvcn on 2019-7-11.
 * 前台状态枚举类
 */
public enum ReqStatusEnum implements BaseEnum<Integer,String> {

    SUCCESS(200,"请求成功!"),
    FAILURE(500,"请求失败!");

    public static Integer SUCC_CODE = 200;
    public static Integer FAIL_CODE = 500;
    private Integer code;
    private String desc;

    ReqStatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String desc() {
        return desc;
    }
}
