package com.paotui.controller;

import com.paotui.entity.Pueueup;
import com.paotui.service.PueueupService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/pueue")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class PueueController {
    @Autowired
    private PueueupService pueueupService;

    /**
     *  添加帮排队订单
     * @param pueueup
     *  新的排队订单对象
     * @return
     */
    @RequestMapping("/addPueue.do")
    public ResultVo addPueue(Pueueup pueueup){
        ResultVo bean = pueueupService.addPueue(pueueup);

        return bean;
    }
}
