package com.fanyafeng.controller;

import com.fanyafeng.interceptor.AccessRequired;
import com.fanyafeng.mapper.IItemsCustomMapper;
import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsModel;
import com.fanyafeng.model.ItemsQueryVo;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.ItemsService;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 16/10/14 22:12
 * Email: fanyafeng@live.cn
 */
@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ItemsService itemsService;

    @AccessRequired(required = false)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
//        UserModel userModel = userService.findUserById(1);
//        System.out.print(userModel.toString());
//        model.addAttribute("name", userModel.getUsername());
//
//        ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
//        ItemsCustomModel itemsCustomModel = new ItemsCustomModel();
//        itemsCustomModel.setName("笔记本");
//        itemsQueryVo.setItemsCustomModel(itemsCustomModel);
//        List<ItemsCustomModel> itemsCustomModelList = itemsService.findItemsList(itemsQueryVo);
//        for (int i = 0; i < itemsCustomModelList.size(); i++) {
//            itemsCustomModelList.get(i).getName();
//            System.out.print(itemsCustomModelList.get(i).getName());
//        }

        return "index";
    }


}
