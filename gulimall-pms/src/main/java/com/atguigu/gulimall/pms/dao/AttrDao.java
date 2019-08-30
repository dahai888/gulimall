package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author zhangwenliu
 * @email zwl@atguigu.com
 * @date 2019-08-30 12:03:47
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
