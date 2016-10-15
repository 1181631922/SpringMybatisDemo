package com.fanyafeng.mapper;

import com.fanyafeng.model.UserModel;

/**
 * Author： fanyafeng
 * Data： 16/10/15 16:31
 * Email: fanyafeng@live.cn
 */
public interface IUserMapper {
    public UserModel findUserById(int id);
}
