package com.fanyafeng.mapper;

import com.fanyafeng.model.ItemsCustomModel;
import com.fanyafeng.model.ItemsModel;
import com.fanyafeng.model.ItemsQueryVo;

import java.util.List;

/**
 * Author： fanyafeng
 * Data： 16/10/18 10:47
 * Email: fanyafeng@live.cn
 */
public interface IItemsMapper {
    public ItemsModel findItemsById(Integer integer);

    public void updateItems( ItemsModel itemsModel);
}
