package com.boss.xtrain.core.data.convention.message;



import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @ClassName CommonRequest
 * @Description 请求报文
 * @Author HuangJi
 * @Date 2019/8/20 17:36
 * @Version 1.0
 **/


public class CommonRequest <T>{
    /** 版本 */
    String edition;
    /** token */
    String token;
    /** 业务类型*/
    String  businessType;
    /** 设备Id */
    Integer deviceId;
    /** 加密标志 1标记加密 0不加密 */
    Integer  encryptFlag;
    /** 任务对象 */
    @NotNull(message = "Request报文的jsonObject不能为空")
    @Valid
    T jsonObject;

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
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
}
