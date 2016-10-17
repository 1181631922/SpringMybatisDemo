package com.fanyafeng.controller;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Author： fanyafeng
 * Data： 16/10/14 22:12
 * Email: fanyafeng@live.cn
 */
@Controller
public class MainController {

    @Autowired
    private UserService userService;
//private ApplicationContext applicationContext;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        UserModel userModel = userService.findUserById(1);
        System.out.print(userModel.toString());
        model.addAttribute("name", userModel.getUsername());

        return "index";
    }

}
