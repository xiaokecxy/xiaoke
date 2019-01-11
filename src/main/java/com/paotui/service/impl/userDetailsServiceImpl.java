package com.paotui.service.impl;

import com.paotui.entity.userDetails;
import com.paotui.mapper.userDetailsMapper;
import com.paotui.service.userDetailsService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userDetailsServiceImpl implements userDetailsService {

    @Autowired
    private userDetailsMapper userDetailsDao;
    @Override
    public ResultVo updateadd(userDetails userDetails) {

        userDetailsDao.updateByPrimaryKeySelective(userDetails);

        return null;
    }

    @Override
    public ResultVo findByUid(Integer uid) {

        userDetails userDetails = userDetailsDao.findByUid(uid);

        ResultVo vo = ResultVo.setOK(userDetails);


        return vo;
    }
}
