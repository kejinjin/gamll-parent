package com.atguigu.gmall.annotation;


import com.atguigu.gmall.minio.config.MinioAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;


//1、首先导入了 MinioAutoConfiguration，
//   1.1）、开启了 MinioProperties 的属性绑定，自动和当前项目配置文件中app.minio下的所有配置进行绑定
//   1.2）、MinioProperties 也在容器中
//   1.3）、给容器中注入了 MinioClient
//   1.4）、给容器中注入了 OSSService
@Import({MinioAutoConfiguration.class})
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface EnableMinio {

}
