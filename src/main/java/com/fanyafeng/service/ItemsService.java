package com.fanyafeng.service;

import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsModel;
import com.fanyafeng.model.ItemsQueryVo;

import java.util.List;

/**
 * Author： fanyafeng
 * Data： 16/10/18 11:16
 * Email: fanyafeng@live.cn
 */
public interface ItemsService {
    public List<ItemsCustomModel> findItemsList(ItemsQueryVo itemsQueryVo);

    public ItemsCustomModel findItemsById(Integer integer);

    public void updateItems(ItemsModel itemsCustomModel);

    public void deleteItems(ItemsQueryVo itemsQueryVo);

}
