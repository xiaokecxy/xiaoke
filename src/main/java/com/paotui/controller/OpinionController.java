package com.paotui.controller;

import com.paotui.entity.Opinion;
import com.paotui.service.OpinionService;
import com.paotui.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@Api(produces = "这是java编写的接口文档",value = "接口文档")
public class OpinionController {

    @Autowired
    private OpinionService opinionService;

    @PostMapping("/insertOpinion.do")
    @ApiOperation(notes = "添加意见建议",tags = {"页面内的所有参数和当前登录人的id，图片不要超过三张（我没有做限制）"},value = "意见反馈接口")
    public ResultVo insertOpinion(@RequestParam("f") MultipartFile[] mFiles, Opinion opinion){

        List<String> imgname = new ArrayList<>();
        //创建文件夹
        String path = "D:/upload";
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }
        //如果有图片就处理图片
        if (mFiles != null) {
            for (MultipartFile mFile : mFiles) {
                String name = mFile.getOriginalFilename();
                String uuid = UUID.randomUUID().toString();
                String fName = uuid + "_" + name;
                imgname.add(fName);
                File f = new File(path, fName);
                try {
                    mFile.transferTo(f);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

        return opinionService.insertOpinion(imgname, opinion);
    }


}
