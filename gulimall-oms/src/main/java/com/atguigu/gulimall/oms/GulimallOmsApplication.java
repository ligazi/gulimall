package com.atguigu.gulimall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.atguigu.gulimall.oms.dao")
@SpringBootApplication
public class GulimallOmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallOmsApplication.class, args);
    }

}
