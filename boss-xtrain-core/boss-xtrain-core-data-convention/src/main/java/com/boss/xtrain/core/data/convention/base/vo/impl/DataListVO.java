package com.boss.xtrain.core.data.convention.base.vo.impl;

import com.boss.xtrain.core.data.convention.base.vo.BaseVO;

import java.util.List;

/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 查询数据为List时的数据类
 * @author: HuangJi
 * @create: 2019-12-05 20:52
 **/

public class DataListVO<T> extends BaseVO {


    /**
     * 存放list对象
     */
    List<T> listObj;
    public void setListObj(List<T> listObj){
        this.listObj=listObj;
    }

    public List<T> getListObj(){
        return listObj;
    }

    @Override
    public String toString() {
        return "DataListVO{" +
                "listObj=" + listObj +
                '}';
    }
}
