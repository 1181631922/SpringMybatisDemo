package com.fanyafeng.model;

/**
 * Author： fanyafeng
 * Data： 16/10/18 10:54
 * Email: fanyafeng@live.cn
 * <p>
 * 商品包装对象
 * 对原始生成的po进行扩展
 */

public class ItemsQueryVo {
    private ItemsModel itemsModel;

    private ItemsCustomModel itemsCustomModel;

    public ItemsModel getItemsModel() {
        return itemsModel;
    }

    public void setItemsModel(ItemsModel itemsModel) {
        this.itemsModel = itemsModel;
    }

    public ItemsCustomModel getItemsCustomModel() {
        return itemsCustomModel;
    }

    public void setItemsCustomModel(ItemsCustomModel itemsCustomModel) {
        this.itemsCustomModel = itemsCustomModel;
    }
}
