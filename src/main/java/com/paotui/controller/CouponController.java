package com.paotui.controller;

import com.paotui.service.CouponService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/coupon")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class CouponController {

    @Autowired
    private CouponService couponService;

    /**
     *  获取当前用户的所有优惠券
     * @param uid
     *     用户id
     * @return
     */
    @RequestMapping("/findCoupon.do")
    @ApiOperation(notes = "通过用户的id获取用户的优惠券",tags = {"获取用户的优惠券，需要用户id,任意提交方式"},value = "获取用户的优惠券接口")
    public ResultVo findByUid(Integer uid){
        System.out.println(uid);
        ResultVo bean = couponService.findCouponByUid(uid);

        return bean;

    }

}
