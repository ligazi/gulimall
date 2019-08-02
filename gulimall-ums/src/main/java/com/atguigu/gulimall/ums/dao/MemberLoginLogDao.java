package com.atguigu.gulimall.ums.dao;

import com.atguigu.gulimall.ums.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author leifengyang
 * @email lfy@atguigu.com
 * @date 2019-08-01 20:38:09
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
