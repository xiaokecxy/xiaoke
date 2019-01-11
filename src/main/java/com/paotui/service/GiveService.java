package com.paotui.service;

import com.paotui.entity.Give;
import com.paotui.vo.ResultVo;

public interface GiveService {

    ResultVo insert(Give give);

    ResultVo updateState(int id, int i);
}
