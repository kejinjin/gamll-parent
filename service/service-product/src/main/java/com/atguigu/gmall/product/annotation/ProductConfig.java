package com.atguigu.gmall.product.annotation;

import com.atguigu.gmall.config.AppMybatisPlusConfiguratoin;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


/**
 * 商品服务的默认配置
 */
@MapperScan(basePackages = {"com.atguigu.gmall.product.dao","com.atguigu.gmall.product.mapper"})
@Import(AppMybatisPlusConfiguratoin.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface ProductConfig {
}
