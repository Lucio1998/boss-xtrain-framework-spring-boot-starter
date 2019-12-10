package com.boss.xtrain.core.data.convention.util;

import com.boss.xtrain.core.data.convention.message.CommonRequest;
import com.boss.xtrain.core.data.convention.message.CommonResponse;
import org.springframework.beans.factory.annotation.Value;

/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 这个是设置版本的工具类
 * @author: HuangJi
 * @create: 2019-12-09 19:58
 **/

public class AppUtils {

    /**
     * 版本获取，通过properties配置文件中获取
     */
    @Value("${version}")
    private static String VERSION;

    /**
     * @description: 响应报文的系统version设置
     * @params:[commonResponse]
     * @return void
     */
    public static void setResponseExtendInfo(CommonResponse<Object> commonResponse){
        commonResponse.setEdition(VERSION);
    }

    /**
     * @description: 请求报文的系统version设置
     * @params:[commonRequest]
     * @return void
     */
    public static void setRequestExtendInfo(CommonRequest<Object> commonRequest){
        commonRequest.setEdition(VERSION);
    }
}
