package com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IItemsCustomMapper;
import com.fanyafeng.mapper.IItemsMapper;
import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsModel;
import com.fanyafeng.model.ItemsQueryVo;
import com.fanyafeng.service.ItemsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author： fanyafeng
 * Data： 16/10/18 11:17
 * Email: fanyafeng@live.cn
 */
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private IItemsCustomMapper iItemsCustomMapper;

    @Autowired
    private IItemsMapper iItemsMapper;

    @Override
    public List<ItemsCustomModel> findItemsList(ItemsQueryVo itemsQueryVo) {

        return iItemsCustomMapper.findItemsList(itemsQueryVo);
    }

    @Override
    public ItemsCustomModel findItemsById(Integer integer) {
        ItemsModel itemsModel = iItemsMapper.findItemsById(integer);
        ItemsCustomModel itemsCustomModel = new ItemsCustomModel();
        BeanUtils.copyProperties(itemsModel, itemsCustomModel);

        return itemsCustomModel;
    }

    @Override
    public void updateItems( ItemsModel itemsCustomModel) {
        System.out.println("我的service"  + itemsCustomModel);
        iItemsMapper.updateItems(itemsCustomModel);
    }

}
