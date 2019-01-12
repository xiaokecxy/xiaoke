package com.paotui.service;

import com.paotui.entity.ptUser;
import com.paotui.vo.ResultVo;

public interface ptUserService {
    // 查询账号是否存在
    ResultVo registerOne(String mobile);

    //发送验证码
    ResultVo registerTwo(String mobile);

    //注册成功
    ResultVo registerThr(String mobile,String password);

    // 登陆
    ResultVo login(String mobile,String password);

    //修改密码
    ResultVo updatePassword(ptUser record);

    //忘记密码(输入账号查询是否存在)
    ResultVo selectByMobile(String mobile);
}
