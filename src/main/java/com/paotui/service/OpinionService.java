package com.paotui.service;

import com.paotui.entity.Opinion;
import com.paotui.vo.ResultVo;

import java.util.List;

public interface OpinionService {

    ResultVo insertOpinion(List<String> imgname, Opinion opinion);
}
