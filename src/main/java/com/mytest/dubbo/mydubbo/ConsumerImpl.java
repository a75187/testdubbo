package com.mytest.dubbo.mydubbo;/*
 * @author lipei
 *         Date: 2018/11/29
 * @since JDK 1.8
 */


import com.demo.api.face.Consumer;

public class ConsumerImpl implements Consumer {
    @Override
    public String hello() {
        return "hellow";
    }
}
