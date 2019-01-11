package com.paotui.controller;

import com.paotui.service.AreaService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/area")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class AreaController {

    @Autowired
    private AreaService areaService;

    /**
     *  获取用户设置的地址
     * @param uid
     *      用户id
     * @return
     */
    @RequestMapping("/selectAreaByUid.do")
    @ApiOperation(notes = "通过用户ID，获取用户的收货地址",tags = {"获取用户设置的地址，需要用户id,任意提交方式"},value = "获取用户收货地址接口")
    public ResultVo selectAll(Integer uid){

        ResultVo bean = areaService.selectAll(uid);

        return bean;
    }

}
