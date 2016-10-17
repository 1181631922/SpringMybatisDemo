package com.fanyafeng.controller;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Author： fanyafeng
 * Data： 16/10/14 22:12
 * Email: fanyafeng@live.cn
 */
@Controller
public class MainController {

//    @Resource
//    private IUserMapper userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
//        UserModel userModel = userService.findUserById(1);
//        System.out.print(userModel.toString());
        return "index";
    }
}
