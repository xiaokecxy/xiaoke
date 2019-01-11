package com.paotui.service.impl;

import com.paotui.entity.Coupon;
import com.paotui.mapper.CouponMapper;
import com.paotui.service.CouponService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouponServiceImpl implements CouponService {

    @Autowired
    private CouponMapper couponDao;


    @Override
    public ResultVo findCouponByUid(Integer uid) {


            List<Coupon> list = couponDao.findByUid(uid);
            return ResultVo.setOK(list);


    }
}
