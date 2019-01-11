package com.paotui.service.impl;

import com.paotui.entity.Help;
import com.paotui.mapper.HelpMapper;
import com.paotui.service.HelpService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelpServiceImpl implements HelpService {

    @Autowired
    private HelpMapper helpDao;
    @Override
    public ResultVo addHelp(Help help) {
        int i = helpDao.insertSelective(help);

        if (i != 0) {
            return  ResultVo.setOK("下单成功");
        } else {
            return  ResultVo.setERROR();
        }

    }
}
