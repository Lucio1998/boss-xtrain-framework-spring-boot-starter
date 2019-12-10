package com.boss.xtrain.core.data.convention.message;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @ClassName CommonResponse
 * @Description 应答报文 ，默认应答码为0
 * @Author BlazeJack
 * @Date 2019/8/20 17:36
 * @Version 1.0
 **/

public class CommonResponse<T> {
    /** 版本 */
    String edition;
    /** 应答码 */
    String responseCode;
    /** 消息 */
    String message;
    /** 加密标志 1标记加密 0不加密 */
    Integer  encryptFlag;
    /** 任务对象 */
    @Valid
    @NotNull(message = "Response报文的jsonObject不能为空")
    T jsonObject;

    public CommonResponse(){
        this.responseCode="0";
    }
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getEncryptFlag() {
        return encryptFlag;
    }

    public void setEncryptFlag(Integer encryptFlag) {
        this.encryptFlag = encryptFlag;
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
                "edition='" + edition + '\'' +
                ", responseCode='" + responseCode + '\'' +
                ", message='" + message + '\'' +
                ", encryptFlag=" + encryptFlag +
                ", jsonObject=" + jsonObject +
                '}';
    }
}
