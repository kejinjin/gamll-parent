package com.atguigu.gmall.minio.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 对象存储服务组件
 */
public interface OSSService {
    /**
     * 上传保存前端提交的文件到Minio。并返回文件的访问路径
     * @param file   需要上传的文件
     * @return  文件访问路径
     */
    String uploadFile(MultipartFile file) throws Exception;
}
