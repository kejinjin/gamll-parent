package com.atguigu.gmall.product.controller;


import com.atguigu.gmall.common.result.Result;
import com.atguigu.gmall.model.product.BaseCategory1;
import com.atguigu.gmall.model.product.BaseCategory2;
import com.atguigu.gmall.model.product.BaseCategory3;
import com.atguigu.gmall.product.service.BaseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/admin/product")
@RestController
public class CategoryController {


    @Autowired
    BaseCategoryService baseCategoryService;

    //查询一级分类
    @GetMapping("/getCategory1")
    public Result getCategory1(){

        //TODO 查询出所有的一级分类
        List<BaseCategory1> category1s =  baseCategoryService.getAllCategory1();


        return Result.ok(category1s);
    }

    //获取一个分类的二级分类
    @GetMapping("/getCategory2/{category1Id}")
    public Result getCategory2(@PathVariable("category1Id") Long category1Id){

        List<BaseCategory2> category2s = baseCategoryService.getCategory2ByC1id(category1Id);

        return Result.ok(category2s);
    }

    //获取一个二级分类的子分类（三级分类）  admin/product/
    @GetMapping("/getCategory3/{category2Id}")
    public Result getCategory3(@PathVariable("category2Id") Long category2Id){

        List<BaseCategory3> baseCategory3s = baseCategoryService.getCategory3ByC2id(category2Id);
        return Result.ok(baseCategory3s);
    }
}
