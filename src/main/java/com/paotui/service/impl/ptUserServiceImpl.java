package com.paotui.service.impl;

import com.paotui.common.QcloudSms;
import com.paotui.entity.userDetails;
import com.paotui.mapper.ptUserMapper;
import com.paotui.entity.ptUser;
import com.paotui.mapper.userDetailsMapper;
import com.paotui.service.ptUserService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ptUserServiceImpl implements ptUserService {

    @Autowired
    private ptUserMapper userDao;
    @Autowired
    private userDetailsMapper userInfoDao;
    //注册判断
    @Override
    public ResultVo registerOne(String mobile) {
        ptUser user = userDao.selectByPrimaryKey(mobile);
        if (user == null){
            return ResultVo.setOK(null);
        }else{
            return ResultVo.setERROR();
        }
    }

    //发送验证码
    @Override
    public ResultVo registerTwo(String mobile) {
        String code =  QcloudSms.getCode();//获取随机验证码
        try {
            //调用接口方法，发送短信到手机 --mobile接收短信的手机号码
            QcloudSms.sendCode(mobile,code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultVo.setOK(code);
    }

    //注册成功
    @Override
    public ResultVo registerThr(ptUser user) {
        if (userDao.insert(user)>0) {
            ptUser ptUser = userDao.selectByPrimaryKey(user.getMobile());
            userDetails userInfo = new userDetails();
            userInfo.setNickname(ptUser.getMobile());
            userInfo.setUid(ptUser.getId());
            userInfo.setSex(0);
            userInfo.setBalance(0);
            userInfo.setIndent(ptUser.getMobile());
            userInfoDao.insertSelective(userInfo);

            return ResultVo.setOK(null);
        }else {
            return ResultVo.setERROR();
        }
    }

    //登录
    @Override
    public ResultVo login(String mobile,String password) {
        ptUser user = userDao.selectByPrimaryKey(mobile);
        if (user != null) {
            if (user.getPassword().equals(password)){
                //这个id为其他表的uid 关联键
                return  ResultVo.setOK(user.getId());
            }
            return ResultVo.setERROR();
        }else{
            return ResultVo.setERROR();
        }

    }

    //修改密码
    @Override
    public ResultVo updatePassword(ptUser record) {

        if (record != null){
            userDao.updateByPrimaryKey(record);
            return ResultVo.setOK(null);
        }
        return ResultVo.setERROR();
    }

    //忘记密码(查询手机号是否存在)
    @Override
    public ResultVo selectByMobile(String mobile) {
        ptUser user = userDao.selectByPrimaryKey(mobile);
        if (user != null) {
            String code = QcloudSms.getCode();
            try {
                //调用接口方法，发送短信到手机 --mobile接收短信的手机号码
                QcloudSms.sendCode(mobile, code);
                return ResultVo.setOK(null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return ResultVo.setERROR();
    }
}
