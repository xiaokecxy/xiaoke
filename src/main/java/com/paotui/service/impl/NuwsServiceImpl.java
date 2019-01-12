package com.paotui.service.impl;

import com.paotui.entity.Nuws;
import com.paotui.mapper.NuwsMapper;
import com.paotui.service.NuwsService;
import com.paotui.vo.PageBeanVo;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NuwsServiceImpl implements NuwsService {

    @Autowired
    private NuwsMapper nuwsMapper;

    @Override
    public ResultVo selectById(Integer id) {
        ResultVo vo = new ResultVo();
        Nuws nuws = nuwsMapper.selectById(id);
        if (nuws != null) {
            return vo.setOK(nuws);
        }
        return vo.setERROR() ;
    }

    @Override
    public PageBeanVo<Nuws> selectAll(Integer id, Integer page, Integer limit) {
        Map<String,Object> map = new HashMap();
        map.put("uid",id);
        map.put("index",(page-1)*limit);
        map.put("limit",limit);
        return PageBeanVo.setPage(nuwsMapper.selectCount(), nuwsMapper.selectAll(map));
    }
}
