package com.paotui.service.impl;

import com.paotui.mapper.*;
import com.paotui.service.BigOrderService;
import com.paotui.vo.BigOrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class BigOrderServiceImpl implements BigOrderService {

    @Autowired
    private BuyMapper buyMapper;

    @Autowired
    private GetMapper getMapper;

    @Autowired
    private GiveMapper giveMapper;

    @Autowired
    private PueueupMapper pueueupMapper;

    @Autowired
    private HelpMapper helpMapper;

    @Override
    public BigOrderVo selectByOrder(Map map) {

        BigOrderVo vo = new BigOrderVo();

        vo.setBuys(buyMapper.selectByOrder(map));
        vo.setGets(getMapper.selectByOrder(map));
        vo.setGives(giveMapper.selectByOrder(map));
        vo.setPueueups(pueueupMapper.selectByOrder(map));
        vo.setHelps(helpMapper.selectByOrder(map));

        return vo;
    }
}
