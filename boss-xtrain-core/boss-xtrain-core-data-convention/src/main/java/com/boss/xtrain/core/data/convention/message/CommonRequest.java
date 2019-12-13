package com.boss.xtrain.core.data.convention.message;



import com.boss.xtrain.core.data.convention.message.head.RequestHead;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @ClassName CommonRequest
 * @Description 请求报文
 * @Author HuangJi
 * @Date 2019/8/20 17:36
 * @Version 1.0
 **/
public class CommonRequest <T> implements Request{

    public CommonRequest(){

    }

    /** 任务对象 */
    @NotNull(message = "Request报文的jsonObject不能为空")
    @Valid
    T jsonObject;
    RequestHead requestHead=new RequestHead();


    public T getJsonObject() {
        return jsonObject;
    }
    public void setJsonObject(T jsonObject) {
        this.jsonObject = jsonObject;
    }
    public T getBody() {
        return jsonObject;
    }
    public void setBody(T jsonObject) {
        this.jsonObject = jsonObject;
    }
    public RequestHead getRequestHead() {
        return requestHead;
    }
    public void setRequestHead(RequestHead requestHead) {
        this.requestHead = requestHead;
    }

    @Override
    public String toString() {
        return "CommonRequest{" +
                "requestHead=" + requestHead +
                ", jsonObject=" + jsonObject +
                '}';
    }
}
