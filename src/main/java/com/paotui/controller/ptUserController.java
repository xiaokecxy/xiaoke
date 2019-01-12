package com.paotui.controller;

import com.paotui.config.SystemConst;
import com.paotui.entity.ptUser;
import com.paotui.service.ptUserService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(produces = "这是Java编写的接口文档",value = "接口文档")
@CrossOrigin //跨域
@RestController //等于 @Controller + @ResponseBody
public class ptUserController {
    @Autowired
    private ptUserService userService;



    //登陆
    @PostMapping("/login.do")
    @ApiOperation(notes = "登录登陆，返回的id为uid，任何uid都为次id ",tags = {"登录登陆，返回的id为uid全局都要用"},value = "登录接口")
    public ResultVo login(String mobile, String password) {
        ResultVo vo= userService.login(mobile, password);

            return vo;



    }

    //注册第一步(验证手机号是否存在)
    @PostMapping("/save.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"注册"},value = "注册第一步(验证手机号是否存在并发送验证码)")
    public ResultVo register(String mobile) {
        ptUser user = new ptUser();
        user.setMobile(mobile);

        ResultVo vo = userService.registerOne(mobile);
        if (vo.getCode() == 0) {

            ResultVo vo1 = userService.registerTwo(mobile);

            SystemConst.currUsers.put("code", vo1.getData());

            SystemConst.currUsers.put("phone", mobile);


            return ResultVo.setOK(null);
        } else {
            return ResultVo.setERROR();
        }
    }
    //注册第二步(校验)
    @GetMapping("/send.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"注册"},value = "注册第二步(验证输入的验证码是否正确)")
    public ResultVo registerTwo(String code){

        Object obj = SystemConst.currUsers.get("code");
        if (code.equals(obj)) {
            return ResultVo.setOK(null);
        } else{
            return ResultVo.setERROR();
        }
    }
    //注册第三步
    @PostMapping("/register.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"注册"},value = "注册第三步(传入账号密码，创建成功)")
    public ResultVo registerThr(String mobile,String password){

       return userService.registerThr(mobile,password);





//        ResultVo vo = userService.registerOne(mobile);
//        if (vo != null){
//            ptUser user = new ptUser();
//            user.setMobile(mobile);
//            user.setPassword(password);
//            ResultVo vo1 = userService.registerThr(user);
//            return ResultVo.setOK(null);
//        }else{
//            return ResultVo.setERROR();
//        }
    }
    //忘记密码(验证手机号是否存在)
    @GetMapping("/selectByMobile.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"忘记密码"},value = "忘记第一步(验证手机号是否存在)")
    public ResultVo forget(String mobile){
        ResultVo vo = userService.selectByMobile(mobile);
        if (vo.getCode() == 0) {

            ResultVo vo1 = userService.registerTwo(mobile);

            SystemConst.currUsers.put("code", vo1.getData());

            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR();
        }
    }
    //忘记密码(验证验证码是否正确)
    @GetMapping("/forsend.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"忘记密码"},value = "忘记第二步(验证输入的验证码是否正确)")
    public ResultVo forgetTwo(String code){

        Object obj = SystemConst.currUsers.get("code");
        if (code.equals(obj)) {
            return ResultVo.setOK(null);
        } else{
            return ResultVo.setERROR();
        }
    }
    //修改密码
    @GetMapping("/updateByPassword.do")
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据",tags = {"修改密码"},value = "修改密码")
    public ResultVo updatePassword(ptUser record){
        return userService.updatePassword(record);
    }
}
