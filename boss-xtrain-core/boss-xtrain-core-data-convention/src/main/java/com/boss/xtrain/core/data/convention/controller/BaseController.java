package com.boss.xtrain.core.data.convention.controller;

/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 控制器继承该基类便于后续为所有的控制器类添加扩展方法。
 * 预留了控制器扩展的统一接口
 * @author: HuangJi
 * @create: 2019-12-05 21:38
 **/

import com.boss.xtrain.core.data.convention.message.CommonRequest;
import com.boss.xtrain.core.data.convention.message.CommonResponse;
import com.boss.xtrain.core.data.convention.util.AppUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {


    /**
     * @description: 分页操作，设置分页的一些信息
     * @params:[pageIndex, pageSize]
     * @return void
     */
    protected static void doBeforePagination(int pageIndex,int pageSize) {
        Page page = PageHelper.startPage(pageIndex, pageSize);
    }

    /**
     * @description: 封装应答包
     * @params:[object]
     * @return com.boss.xtrain.core.data.convention.message.CommonResponse
     */
    protected static CommonResponse buildCommonResponse(Object object){
        CommonResponse<Object> commonResponse=new CommonResponse<Object>();
        //调用工具类设置版本等信息
        AppUtils.setResponseExtendInfo(commonResponse);
        commonResponse.setBody(object);
        return commonResponse;
    }

    /**
     * @description: 封装请求包方法
     * @params:[object]
     * @return com.boss.xtrain.core.data.convention.message.CommonRequest
     */
    protected static CommonRequest buildCommonRequest(Object object){
        CommonRequest<Object> commonRequest=new CommonRequest<>();
        //调用工具类设置版本等信息
        AppUtils.setRequestExtendInfo(commonRequest);
        commonRequest.setBody(object);
        return commonRequest;
    }
}
