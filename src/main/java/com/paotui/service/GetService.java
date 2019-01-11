package com.paotui.service;

import com.paotui.entity.Get;
import com.paotui.vo.ResultVo;

public interface GetService {

    ResultVo insert(Get tget);

    ResultVo updateState(int id, int i);

}
