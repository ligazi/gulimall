package com.atguigu.gulimall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.atguigu.gulimall.sms.dao")
@SpringBootApplication
public class GulimallSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallSmsApplication.class, args);
    }

}
