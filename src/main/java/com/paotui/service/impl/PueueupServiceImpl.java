package com.paotui.service.impl;

import com.paotui.entity.Pueueup;
import com.paotui.mapper.PueueupMapper;
import com.paotui.service.PueueupService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PueueupServiceImpl implements PueueupService {

    @Autowired
    private PueueupMapper pueueDao;

    @Override
    public ResultVo addPueue(Pueueup pueue) {

        int i = pueueDao.insertSelective(pueue);

        if (i != 0){

            return ResultVo.setOK("下单成功");
        }else {
            return ResultVo.setERROR();
        }

    }
}
