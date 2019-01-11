package com.paotui.service.impl;

import com.paotui.entity.Give;
import com.paotui.mapper.GiveMapper;
import com.paotui.service.GiveService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiveServiceImpl implements GiveService {

    @Autowired
    private GiveMapper giveMapper;

    @Override
    public ResultVo insert(Give give) {
        ResultVo vo = new ResultVo();
        give.setState(0);
        int i = giveMapper.insert(give);
        if (i > 0) {
            return vo.setOK(null);
        }
        return vo.setERROR();
    }

    @Override
    public ResultVo updateState(int id, int i) {
        ResultVo vo = new ResultVo();
        if (i == 1) {
            Give give = giveMapper.selectByPrimaryKey(id);
            give.setState(1);
            int n = giveMapper.updateByPrimaryKey(give);
            if (n > 0) {
                return vo.setOK(null);
            } else {
                return vo.setERROR();
            }
        }
        return vo.setERROR();
    }
}
