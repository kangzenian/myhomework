package com.lagou.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  // 将当前项目表示为注册中心的客户端，向注册中心进行注册，可以在所有的注册中心环境下使用
@MapperScan("com.lagou.goods.mapper")
public class GoodsApplication9201 {

    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication9201.class, args);
    }
}
