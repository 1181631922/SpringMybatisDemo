package com.fanyafeng.controller;

import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsModel;
import com.fanyafeng.model.ItemsQueryVo;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * Author： fanyafeng
 * Data： 16/10/18 12:02
 * Email: fanyafeng@live.cn
 */
@Controller
@RequestMapping(value = "/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/itemsList")
    public String itemsList(Model model, ItemsQueryVo itemsQueryVo) {

        List<ItemsCustomModel> itemsCustomModelList = itemsService.findItemsList(itemsQueryVo);
        model.addAttribute("itemsList", itemsCustomModelList);
        return "items/itemsList";
    }

    @RequestMapping(value = "editItems", method = RequestMethod.GET)
    public String editItems(Model model, Integer id) {//参数绑定  @RequestParam
        ItemsCustomModel itemsCustomModel = itemsService.findItemsById(id);

        model.addAttribute("itemsCustom", itemsCustomModel);

        System.out.println("时间itemsCustom" + id + itemsCustomModel.toString());

        return "items/editItems";
    }

    //    重定向,HttpServletRequest接收返回值
    @RequestMapping(value = "editItemsSubmit", method = RequestMethod.GET)
    public String editItemsSubmit(HttpServletRequest httpServletRequest, Integer id, ItemsModel itemsCustomModel) {

        System.out.println("返回的itemsmcustom:" + id + itemsCustomModel.toString());
//        itemsCustomModel.setCreateTime(new Date());
        itemsService.updateItems(itemsCustomModel);
        return "forward:itemsList";//地址栏不变
    }

    @RequestMapping(value = "deleteItems")
    public String deleteItems(Integer[] itemId) {

        return "forward:itemsList";
    }

    @RequestMapping(value = "editItemsQuery")
    public String editItemsQuery(Model model, ItemsQueryVo itemsQueryVo) {
        List<ItemsCustomModel> itemsCustomModelList = itemsService.findItemsList(itemsQueryVo);
        model.addAttribute("itemsList", itemsCustomModelList);
        return "items/editItemsQuery";
    }

    @RequestMapping(value = "editItemsAllSubmit")
    public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo) {
        return "forward:itemsList";
    }
}
