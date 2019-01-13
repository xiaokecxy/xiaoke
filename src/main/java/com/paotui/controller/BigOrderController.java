package com.paotui.controller;

import com.paotui.service.BigOrderService;
import com.paotui.vo.BigOrderVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class BigOrderController {

    @Autowired
    private BigOrderService bigOrderService;

    @GetMapping("/selectOrder.do")
    @ApiOperation(notes = "通过用户ID，展示用户的订单",tags = {"参数uid为当前用户的id必须传，参数state是的订单的状态状态0待支付 1待接单 2进行中 3待收货 4已完成 5已取消，查询全部就不用传"},value = "展示订单")
    public BigOrderVo selcetOrder(Integer uid, Integer state) {
        Map map = new HashMap<String,Integer>();
        map.put("uid", uid);
        map.put("state", state);
        return bigOrderService.selectByOrder(map);
    }
}
