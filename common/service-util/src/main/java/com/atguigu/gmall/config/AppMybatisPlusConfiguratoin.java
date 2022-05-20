package com.atguigu.gmall.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * 以后MyBatis有关的一次性都配置在这里
 */
@EnableTransactionManagement //开启自动基于注解的事务功能
@Configuration
public class AppMybatisPlusConfiguratoin {

    /**
     * MybatisPlus 的功能拦截器
     * @return
     */
    @Bean
    public MybatisPlusInterceptor interceptor(){
        //mybatis总拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

        //小拦截器放到总拦截器中
        //1、准备分页拦截器
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setOverflow(true);//允许页码溢出

        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }
}
