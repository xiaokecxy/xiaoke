package com.paotui.service;

import com.paotui.entity.Nuws;
import com.paotui.vo.PageBeanVo;
import com.paotui.vo.ResultVo;

public interface NuwsService {

    ResultVo selectById(Integer id);

    PageBeanVo<Nuws> selectAll(Integer uid, Integer index, Integer limit);

}
