package com.atguigu.gmall.product.mapper;


import com.atguigu.gmall.model.product.BaseAttrInfo;
import com.atguigu.gmall.model.product.BaseAttrValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author lfy
* @description 针对表【base_attr_info(属性表)】的数据库操作Mapper
* @createDate 2022-05-18 09:00:47
* @Entity com.atguigu.gmall.product.domain.BaseAttrInfo
*/
public interface BaseAttrInfoMapper extends BaseMapper<BaseAttrInfo> {

    /**
     * 根据分类id查询对应的所有平台属性名和值
     * @param c1Id
     * @param c2Id
     * @param c3Id
     * @return
     */
    List<BaseAttrInfo> selectAttrInfoAndAttrValueByCategoryId(@Param("c1Id") Long c1Id,
                                                              @Param("c2Id") Long c2Id,
                                                              @Param("c3Id") Long c3Id);

    /**
     * 根据属性id查询名和值
     * @param attrId
     * @return
     */
    BaseAttrInfo findAttrInfoAndValueByAttrId(Long attrId);

    /**
     * 根据属性id查询属性的所有值
     * @param attrId
     * @return
     */
    List<BaseAttrValue> findAttrValuesByAttrId(Long attrId);
}




