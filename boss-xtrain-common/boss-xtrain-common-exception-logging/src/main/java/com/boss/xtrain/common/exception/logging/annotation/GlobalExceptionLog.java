package com.boss.xtrain.common.exception.logging.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

/**
 * @Description 统一异常注解
 * @Author 刘磊
 * @Date 2019/12/11 0011 11:13
 **/
@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GlobalExceptionLog {
    /**
     * 设置默认值
     */
    String value() default "";
}
