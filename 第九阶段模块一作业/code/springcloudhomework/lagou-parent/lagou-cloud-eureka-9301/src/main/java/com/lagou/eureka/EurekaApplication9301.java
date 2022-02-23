package com.lagou.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaServer // 声明本项目是一个Eureka服务
public class EurekaApplication9301 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication9301.class, args);
    }
}
