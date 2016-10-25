package com.fanyafeng.controller;

import com.fanyafeng.model.ItemsCustomModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 16/10/24 15:21
 * Email: fanyafeng@live.cn
 */
@Controller
public class JsonController {

    //    json数据
    @RequestMapping(value = "/myJson", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("xingming", "fanyafeng");
        return map;
    }

    @RequestMapping(value = "/jsonTest")
    public String RequestJson() {
        return "jsonTest";
    }

    @RequestMapping(value = "/requestJson",produces = "application/json")
    @ResponseBody
    public ItemsCustomModel requestJson(@RequestBody ItemsCustomModel itemsCustomModel) {

        return itemsCustomModel;
    }
}
