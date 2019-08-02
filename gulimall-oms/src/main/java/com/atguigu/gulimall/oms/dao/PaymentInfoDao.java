package com.atguigu.gulimall.oms.dao;

import com.atguigu.gulimall.oms.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-01 20:33:14
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
