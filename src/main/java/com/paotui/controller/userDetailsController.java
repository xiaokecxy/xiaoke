package com.paotui.controller;

import com.paotui.entity.userDetails;
import com.paotui.service.userDetailsService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/userInfo")
@Api(produces = "这是Java编写的接口文档",value = "接口文档")
public class userDetailsController {
    @Autowired
    private userDetailsService userDetailsService;

    @GetMapping("/findByUid")
    @ApiOperation(notes = "查看用户详细信息",tags = {"查看用户详细信息"},value = "查看用户详细信息接口")
    public ResultVo findByUid(Integer uid){
        ResultVo vo = userDetailsService.findByUid(uid);

        return vo;
    }

    @PostMapping("/updata")
    @ApiOperation(notes = "修改用户详细信息",tags = {"修改用户详细信息，indent为用户手机号"},value = "修改用户信息")
    public ResultVo updata(userDetails userDetails){

        ResultVo vo = userDetailsService.updateadd(userDetails);

        return vo;
    }


}
