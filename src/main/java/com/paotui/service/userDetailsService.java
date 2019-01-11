package com.paotui.service;

import com.paotui.entity.userDetails;
import com.paotui.vo.ResultVo;

public interface userDetailsService {
    //CRUD
    ResultVo updateadd(userDetails record);

    ResultVo findByUid(Integer uid);

}
