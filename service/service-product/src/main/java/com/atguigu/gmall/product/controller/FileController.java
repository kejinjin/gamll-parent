package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.minio.service.OSSService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件功能处理器
 */
@Slf4j
@RequestMapping("/admin/product")
@RestController
public class FileController {


    @Autowired
    OSSService ossService;

    /**
     * 文件上传
     * MultipartFile file： 接受文件上传的文件流数据
     * <input  type="file" name="abc" value="真正的文件信息"/>
     * @return
     */
    @PostMapping("/fileUpload")
    public Result uploadFile(MultipartFile file) throws Exception {
        String filename = file.getOriginalFilename();
        long size = file.getSize();
        String type = file.getContentType();
        log.info("文件上传：文件信息： 文件名：{}，文件大小：{}， 文件类型：{}",filename,size,type);

        //处理文件上传
        String path =  ossService.uploadFile(file);

        return Result.ok(path);
    }
}
