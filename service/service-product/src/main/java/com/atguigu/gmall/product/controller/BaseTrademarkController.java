package com.atguigu.gmall.product.controller;

import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseTrademark;
import com.atguigu.gmall.product.service.BaseTrademarkService;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 处理和品牌有关的请求
 */
@RequestMapping("/admin/product")
@RestController
public class BaseTrademarkController {


    @Autowired
    BaseTrademarkService baseTrademarkService;
    /**
     * 分页查询所有品牌
     * @return
     */
    @GetMapping("/baseTrademark/{pageNum}/{pageSize}")
    public Result getBaseTrademarkPage(@PathVariable("pageNum") Long pageNum,
                                       @PathVariable("pageSize") Long pageSize){

        //long current, long size
        Page<BaseTrademark> page = new Page<>(pageNum,pageSize);

        //调用分页查询方法
        Page<BaseTrademark> result = baseTrademarkService.page(page);

        //前端全量接受分页数据以及查到的结果
        return Result.ok(result);
    }

    //admin/product/baseTrademark/save
    @PostMapping("/baseTrademark/save")
    public Result saveBaseTrademark(@RequestBody BaseTrademark baseTrademark){

        baseTrademarkService.save(baseTrademark);
        return Result.ok();
    }


    /**
     * 查询某一个品牌
     * @return
     */
    @GetMapping("/baseTrademark/get/{id}")
    public Result getBaseTrademarkById(@PathVariable("id") Long id){
        BaseTrademark trademark = baseTrademarkService.getById(id);
        return Result.ok(trademark);
    }

    /**
     * 修改品牌
     */
    @PutMapping("/baseTrademark/update")
    public Result updateBasetrademark(@RequestBody BaseTrademark baseTrademark){
        baseTrademarkService.updateById(baseTrademark);
        return Result.ok();
    }

    /**
     * 删除品牌
     * admin/product/
     */
    @DeleteMapping("/baseTrademark/remove/{id}")
    public Result deletebaseTrademark(@PathVariable("id") Long id){

        baseTrademarkService.removeById(id);
        return Result.ok();
    }

}
