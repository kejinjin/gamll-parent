package com.atguigu.gmall.product;


import com.atguigu.gmall.annotation.EnableMinio;
import com.atguigu.gmall.config.AppMybatisPlusConfiguratoin;
import com.atguigu.gmall.minio.config.MinioAutoConfiguration;
import com.atguigu.gmall.minio.service.impl.OSSServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Mybatis-Plus 场景
 * 1、自动配置：扫描主类所在包下的所有@Mapper注解标注的组件。作为Dao组件，注入到Spring容器
 * 2、@MapperScan(basePackages = "com.atguigu.gmall.product.dao")
 *      指定包下的所有接口，都是mapper，请自动批量扫描
 *
 * 为什么service-util写的配置类，service-product微服务用不到？虽然依赖
 * 1、SpringBoot自动配置原理？
 *   扫描ProductApplication所在的包 "com.atguigu.gmall.product"
 *   工具类的包                     "com.atguigu.gmall.config"
 *
 *
 * SpringBoot：
 * 1、redis自动配置为例
 *
 *
 * 抽取了Minio
 *    Minio: com.atguigu.gmall.minio
 *    主类:   com.atguigu.gmall.product
 */


@SpringCloudApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
