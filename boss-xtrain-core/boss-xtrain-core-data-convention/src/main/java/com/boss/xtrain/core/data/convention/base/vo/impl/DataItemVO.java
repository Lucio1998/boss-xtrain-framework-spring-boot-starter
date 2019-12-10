package com.boss.xtrain.core.data.convention.base.vo.impl;

import com.boss.xtrain.core.data.convention.base.vo.BaseVO;

/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 数据查询得到的数据
 * @author: HuangJi
 * @create: 2019-12-05 20:50
 **/

public class DataItemVO<T> extends BaseVO {

    T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "DataItemVO{" +
                "object=" + object +
                '}';
    }
}
