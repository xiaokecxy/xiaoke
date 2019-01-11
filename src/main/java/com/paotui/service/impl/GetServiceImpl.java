package com.paotui.service.impl;

import com.paotui.entity.Get;
import com.paotui.mapper.GetMapper;
import com.paotui.service.GetService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GetServiceImpl implements GetService {

    @Autowired
    private GetMapper getMapper;

    @Override
    public ResultVo insert(Get tget) {
        ResultVo vo = new ResultVo();
        tget.setState(0);
        int i = getMapper.insert(tget);
        if (i > 0) {
            return vo.setOK(null);
        }
        return vo.setERROR();
    }

    @Override
    public ResultVo updateState(int id, int i) {
        ResultVo vo = new ResultVo();
        if (i == 1) {
            Get get = getMapper.selectByPrimaryKey(id);
            get.setState(1);
            int n = getMapper.updateByPrimaryKey(get);
            if (n > 0) {
                return vo.setOK(null);
            } else {
                return vo.setERROR();
            }
        }
        return vo.setERROR();
    }
}
