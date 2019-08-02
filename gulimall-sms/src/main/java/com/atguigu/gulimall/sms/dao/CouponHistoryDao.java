package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-01 20:36:16
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
