package com.example.proxy.aspect;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by chenlu on 2017/12/14.
 */
@Target(ElementType.METHOD)//声明注解的作用范围（CONSTRUCT/FIELD/LOCAL_VARIABLE/METHOD/PACKAGE/PARAMETER/TYPE）
@Retention(RetentionPolicy.RUNTIME)//声明了注解的生命周期（SOURCE:在源文件中有效；CLASS:在class文件中有效；RUNTIME:运行时有效）
@Documented//标记注解，有该注解的注解会在生成java文档中保留
@Inherited//该注解表明子类是有继承了父类的注解
public @interface InterfaceProperty {
    int outTime() default 400;

    boolean isSendEmail() default true;
}
