package com.boss.xtrain.core.data.convention.message;

import com.boss.xtrain.core.data.convention.message.head.ResponseHead;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @ClassName CommonResponse
 * @Description 应答报文 ，默认应答码为0
 * @Author HJ
 * @Date 2019/8/20 17:36
 * @Version 1.0
 **/

public class CommonResponse<T> implements Response{
    public CommonResponse(){
    }

    /** 任务对象 */
    @Valid
    @NotNull(message = "Response报文的jsonObject不能为空")
    T jsonObject;

    ResponseHead responseHead=new ResponseHead();

    public ResponseHead getResponseHead() {
        return responseHead;
    }
    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }
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

    @Override
    public String toString() {
        return "CommonResponse{" +
                "jsonObject=" + jsonObject +
                ", responseHead=" + responseHead +
                '}';
    }
}
