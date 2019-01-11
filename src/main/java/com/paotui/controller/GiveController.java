package com.paotui.controller;


import com.paotui.entity.Give;
import com.paotui.service.GiveService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(produces = "这是java编写的接口文档",value = "接口文档")
public class GiveController {

    @Autowired
    private GiveService giveService;

    @PostMapping("/insertGive.do")
    @ApiOperation(notes = "添加订单",tags = {"订单页面内的所有参数"},value = "帮忙送订单接口")
    public ResultVo insertGet(Give give) {
        return giveService.insert(give);
    }

    //确认付款后修改状态（待接单）
    @ApiOperation(notes = "改变订单状态",tags = {"需要当前订单的id，需要一个是否缺支付的状态int类型0为未支付1为支付"},value = "改变订单状态的接口")
    @GetMapping("/updateGiveState.do")
    public ResultVo updateState(int id, int i) {return giveService.updateState(id, i);}
}
