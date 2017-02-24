package com.fanyafeng.controller;

import com.fanyafeng.interceptor.AccessRequired;
import com.fanyafeng.model.StartImageModel;
import com.fanyafeng.util.MyUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 17/1/12 17:22
 * Email: fanyafeng@live.cn
 */
@Controller
@RequestMapping(value = "/start")
public class StartController {

    @AccessRequired(required = false)
    @ResponseBody
    @RequestMapping(value = "getStartInfo", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    private Map<String, Object> getStartInfo() {
        Map<String, Object> map = new HashMap<>();
        map.put("state", "ok");
        List<StartImageModel> startImageModelList = new ArrayList<>();//如果是一张做开屏图,多张就是轮播图
        for (int i = 1; i < 6; i++) {
            StartImageModel startImageModel = new StartImageModel();
            startImageModel.setLink_url("http://www.baidu.com");
            startImageModel.setSeconds(3000);
            startImageModel.setType("jpg");
            startImageModel.setIs_show(true);
            startImageModel.setImg_url("http://localhost:8080/recreation-1.0/start/getPic?name=" + i + ".png");
            startImageModelList.add(startImageModel);
        }
        map.put("imageList", startImageModelList);
        return map;
    }

    @AccessRequired(required = false)
    @RequestMapping(value = "/getPic", produces = MediaType.IMAGE_JPEG_VALUE)//图片可以
    @ResponseBody
    public byte[] getPic(String name) {
        File f = new File("/Users/fanyafeng/IntelliJProject/SpringMybatisDemo/src/main/resources/apk/" + name);
//        File f = new File("/home/fanyafeng/img/" + name);
        return MyUtil.getByte(f);
    }

}
