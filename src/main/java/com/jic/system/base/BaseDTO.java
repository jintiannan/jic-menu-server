package com.jic.system.base;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by lvcn on 2019-7-17.
 */
public class BaseDTO {

    /**
     * 事务持久化乐观锁
     */
    public String ts;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    public String toJsonString(){
        return ToStringBuilder.reflectionToString(this,ToStringStyle.JSON_STYLE);
    }
}
