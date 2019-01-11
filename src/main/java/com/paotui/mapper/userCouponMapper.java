package com.paotui.mapper;

import com.paotui.entity.userCoupon;

public interface userCouponMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userCoupon record);

    int insertSelective(userCoupon record);

    userCoupon selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userCoupon record);

    int updateByPrimaryKey(userCoupon record);
}