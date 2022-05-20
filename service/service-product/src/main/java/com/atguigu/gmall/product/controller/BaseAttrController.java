package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.atguigu.gmall.model.product.BaseAttrValue;
import com.atguigu.gmall.product.service.BaseAttrInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 处理和平台属性有关的请求
 */
@Slf4j
@RequestMapping("/admin/product")
@RestController
public class BaseAttrController {


    @Autowired
    BaseAttrInfoService baseAttrInfoService;

    /**
     * 获取指定分类下所有的平台属性列表
     *
     * @return
     */
    @GetMapping("/attrInfoList/{c1Id}/{c2Id}/{c3Id}")
    public Result getAttrInfoList(@PathVariable("c1Id") Long c1Id,
                                  @PathVariable("c2Id") Long c2Id,
                                  @PathVariable("c3Id") Long c3Id) {

        //自注释
        List<BaseAttrInfo> baseAttrInfos = baseAttrInfoService.findAttrInfoAndAttrValueByCategoryId(c1Id, c2Id, c3Id);

        return Result.ok(baseAttrInfos);
    }


    /**
     * 保存平台属性
     *
     * @param attrInfo
     * @return
     */
    @PostMapping("/saveAttrInfo")
    public Result saveAttrInfo(@RequestBody BaseAttrInfo attrInfo) {
        log.info("保存/修改平台属性:{}", attrInfo);
        //保存或修改
        baseAttrInfoService.saveOrUpdateAttrInfo(attrInfo);


        return Result.ok();
    }


    /**
     * 查询某个属性的名和值
     *
     * @param attrId
     * @return
     */
    @GetMapping("/getAttrValueList/{attrId}")
    public Result getAttrValueList(@PathVariable("attrId") Long attrId) {

//        BaseAttrInfo info = baseAttrInfoService.findAttrInfoAndValueByAttrId(attrId);
        List<BaseAttrValue> values = baseAttrInfoService.findAttrValuesByAttrId(attrId);
        return Result.ok(values);
    }
}