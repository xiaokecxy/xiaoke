package com.paotui.service.impl;


import com.paotui.entity.Img;
import com.paotui.entity.Opinion;
import com.paotui.mapper.ImgMapper;
import com.paotui.mapper.OpinionMapper;
import com.paotui.service.OpinionService;
import com.paotui.vo.ResultVo;
import org.apache.ibatis.annotations.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OpinionServiceImpl implements OpinionService {

    @Autowired
    private OpinionMapper opinionMapper;

    @Autowired
    private ImgMapper imgMapper;

    @Override
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public ResultVo insertOpinion(List<String> imgname, Opinion opinion) {
        ResultVo vo = new ResultVo();
        int n = opinionMapper.insert(opinion);
        if (imgname.size() > 0) {
            for (int i = 0; i < imgname.size(); i++) {
                Img img = new Img();
                img.setOid(opinion.getId());
                img.setUid(opinion.getUid());
                img.setName(imgname.get(i));
                imgMapper.insert(img);
            }
        }

        if (n > 0) {
            return vo.setOK(null);
        }

        return vo.setERROR();
    }
}
