package com.paotui.service.impl;

import com.paotui.entity.Area;
import com.paotui.mapper.AreaMapper;
import com.paotui.service.AreaService;
import com.paotui.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaDao;

    @Override
    public ResultVo selectAll(Integer uid) {


            List<Area> list = areaDao.findAll(uid);

            ResultVo bean = ResultVo.setOK(list);

            return bean;


    }
}
