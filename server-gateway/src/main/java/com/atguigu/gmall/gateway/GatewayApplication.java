package com.atguigu.gmall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @SpringBootApplication
 * @EnableDiscoveryClient
 * @EnableCircuitBreaker  ： 开启服务熔断。
 */

//@EnableCircuitBreaker
//@EnableDiscoveryClient
//@SpringBootApplication

//@RefreshScope  //动态刷新配置
@SpringCloudApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class,args);
    }
}
