package com.jic.system.base;

/**
 * Created by lvcn on 2019-7-17.
 * 基础枚举类
 */
public interface BaseEnum<K,V> {
    /**
     * 枚举编码
     * @return
     */
    K code();

    /**
     * 枚举描述
     * @return
     */
    V desc();
}
