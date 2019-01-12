package com.paotui.controller;

import com.paotui.entity.Nuws;
import com.paotui.service.NuwsService;
import com.paotui.vo.PageBeanVo;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class NuwsController {

    @Autowired
    private NuwsService nuwsService;

    @GetMapping("selectById.do")
    @ApiOperation(notes = "查询当前用户所选择的信息",tags = {"id为当前信息的id int类型"},value = "查询当前用户所选择的信息")
    public ResultVo selectById(Integer id) {
        return nuwsService.selectById(id);
    }

    @GetMapping("selectPage.do")
    @ApiOperation(notes = "分页查询当前用户所有信息",tags = {"uid为当用户的id int类型，page为当前页数，limit为条数"},value = "查询用户所有信息接口")
    public PageBeanVo<Nuws> selectAll(Integer uid, Integer page, Integer limit) {
        return nuwsService.selectAll(uid,page,limit);
    }
}
