package com.paotui.controller;

import com.paotui.entity.Help;
import com.paotui.service.HelpService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/help")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class HelpController {

    @Autowired
    private HelpService helpService;

    /**
     *  获取用户的帮帮订单
     * @param help
     *  帮帮订单对象
     * @return
     */
    @PostMapping("/helpAdd.do")
    @ApiOperation(notes = "获取用户的帮帮订单",tags = {"获取用户的帮帮订单"},value = "用户帮帮下单接口")
    public ResultVo addHelp(Help help){

        ResultVo bean = helpService.addHelp(help);

        return bean;
    }

}
