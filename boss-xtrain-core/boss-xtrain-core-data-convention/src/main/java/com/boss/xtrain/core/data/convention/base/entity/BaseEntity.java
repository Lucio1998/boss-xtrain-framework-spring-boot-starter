package com.boss.xtrain.core.data.convention.base.entity;


import java.util.Date;
import java.io.Serializable;


/**
 * @program: boss-xtrain-framework-spring-boot-starter
 * @description: 表结构公共字段
 * @author: HuangJi
 * @create: 2019-12-05 21:48
 **/
public class BaseEntity implements Serializable{
    Long id;
    Byte status;
    Long created_by;
    Date created_time;
    Long updated_by;
    Date updated_time;
    Long version;

    public  Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Long created_by) {
        this.created_by = created_by;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public Long getUpdated_by() {
        return updated_by;
    }

    public void setUpdated_by(Long updated_by) {
        this.updated_by = updated_by;
    }

    public Date getUpdated_time() {
        return updated_time;
    }

    public void setUpdated_time(Date updated_time) {
        this.updated_time = updated_time;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id" + id +
                "status=" + status +
                ", created_by=" + created_by +
                ", created_time=" + created_time +
                ", updated_by=" + updated_by +
                ", updated_time=" + updated_time +
                ", version=" + version +
                '}';
    }
}
