package com.atguigu.gmall.product.service;


import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.atguigu.gmall.model.product.BaseAttrValue;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author lfy
* @description 针对表【base_attr_info(属性表)】的数据库操作Service
* @createDate 2022-05-18 09:00:47
*/
public interface BaseAttrInfoService extends IService<BaseAttrInfo> {


    /**
     * 根据分类id查询对应的所有平台属性的名和值
     * @param c1Id  1级分类id
     * @param c2Id  2级分类id
     * @param c3Id  3级分类id
     * @return
     */
    List<BaseAttrInfo> findAttrInfoAndAttrValueByCategoryId(Long c1Id, Long c2Id, Long c3Id);

    /**
     * 保存平台属性名和值
     * @param attrInfo
     */
    void saveAttrInfoAndValue(BaseAttrInfo attrInfo);

    /**
     * 修改平台属性名和值
     * @param attrInfo
     */
    void updateAttrInfoAndValue(BaseAttrInfo attrInfo);

    /**
     * 根据属性id返回属性名和值
     * @param attrId
     * @return
     */
    BaseAttrInfo findAttrInfoAndValueByAttrId(Long attrId);

    /**
     * 根据属性id返回属性的所有值
     * @param attrId
     * @return
     */
    List<BaseAttrValue> findAttrValuesByAttrId(Long attrId);

    /**
     * 保存或更新属性
     * @param attrInfo
     */
    void saveOrUpdateAttrInfo(BaseAttrInfo attrInfo);

}
