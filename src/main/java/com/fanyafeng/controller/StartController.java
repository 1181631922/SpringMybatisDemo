package com.fanyafeng.controller;

import com.fanyafeng.interceptor.AccessRequired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
        map.put("state", "failed");
        map.put("isShow", true);
        List<String> imgList = new ArrayList<>();
        imgList.add("http://upload-images.jianshu.io/upload_images/2155432-43f1b0fe0916918d.JPG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240");
        map.put("imageList", imgList);
        map.put("linkUrl", "http://www.baidu.com");
        map.put("type", "jpg");//3gp,gif
        map.put("seconds", 3);
        return map;
    }
}
