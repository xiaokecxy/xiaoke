package com.paotui.service.impl;


import com.paotui.entity.Buy;
import com.paotui.mapper.BuyMapper;
import com.paotui.service.BuyService;
import com.paotui.vo.ResultVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyServiceImpl implements BuyService {

    @Autowired
    private BuyMapper buyDao;

    @Override
    public ResultVo addBuy(Buy buy) {

        int i = buyDao.insertSelective(buy);

        if (i != 0){
            ResultVo bean = ResultVo.setOK("下单成功");
            return bean;
        }else {

            ResultVo bean = ResultVo.setERROR();

            return bean;

        }





    }
}
