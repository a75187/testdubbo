package com.mytest.dubbo.mydubbo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class MydubboApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
        //SpringApplication.run(MydubboApplication.class, args);
    }
}
