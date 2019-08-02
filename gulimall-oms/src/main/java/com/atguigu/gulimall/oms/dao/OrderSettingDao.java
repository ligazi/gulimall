package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-01 20:33:14
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
