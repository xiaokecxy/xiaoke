package com.paotui.controller;

import com.paotui.entity.Buy;
import com.paotui.service.BuyService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/buy")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class BuyController {
    @Autowired
    private BuyService buyService;

    /**
     *  添加帮买的订单
     * @param buy
     *      新的订单对象
     * @return
     */
    @RequestMapping("/addIndent.do")
    @ApiOperation(notes = "帮帮买订单的下单",tags = {"获取用户帮买订单任意提交类型都可以"},value = "获取用户帮买订单接口")
    public ResultVo addBuyIndent(Buy buy){
        ResultVo bean = buyService.addBuy(buy);
        return bean;

    }

}
