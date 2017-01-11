package com.fanyafeng.controller;

import com.fanyafeng.interceptor.AccessRequired;
import com.fanyafeng.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 17/1/7 10:13
 * Email: fanyafeng@live.cn
 */
@Controller
@RequestMapping(value = "/version")
public class VersionController {
    @Autowired
    private VersionService versionService;

    @AccessRequired(required = false)
    @RequestMapping(value = "/hasNewVersion", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Object> hasNewVersion() {
        Map<String, Object> map = new HashMap<>();
        map.put("state", "ok");
        map.put("version", versionService.findVersionById(1).getVersion_code());
        return map;
    }

    @RequestMapping(value = "/test1", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public Map<String, Object> test1() {
        Map<String, Object> map = new HashMap<>();
        map.put("state", "ok");
        map.put("hasNewVersion", false);
        return map;
    }
}