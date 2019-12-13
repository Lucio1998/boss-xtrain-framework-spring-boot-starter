package com.boss.xtrain.core.data.convention.util;

import com.boss.xtrain.core.data.convention.message.CommonRequest;
import com.boss.xtrain.core.data.convention.message.CommonResponse;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 这个是设置版本的工具类
 * @author: HuangJi
 * @create: 2019-12-09 19:58
 **/

@Component
public class AppUtils {

    /**
     * 版本获取，通过properties配置文件中获取
     */

    public static String VERSION;

    @Value("${version}")
    public void setVersion(String version){
        VERSION=version;
    }

    /**
     * @description: 响应报文的系统version设置
     * @params:[commonResponse]
     * @return void
     */

    public static CommonResponse setResponseExtendInfo(CommonResponse<Object> commonResponse){

        String version=AppUtils.VERSION;
        commonResponse.getResponseHead().setEdition(version);
        System.out.println("版本"+version);
        return commonResponse;
    }

    /**
     * @description: 请求报文的系统version设置
     * @params:[commonRequest]
     * @return void
     */

    public static CommonRequest setRequestExtendInfo(CommonRequest<Object> commonRequest){
        String version=AppUtils.VERSION;
        commonRequest.getRequestHead().setEdition(version);
        System.out.println("版本"+version);
        System.out.println("版本1"+commonRequest.getRequestHead().getEdition());
        return commonRequest;
    }


}
