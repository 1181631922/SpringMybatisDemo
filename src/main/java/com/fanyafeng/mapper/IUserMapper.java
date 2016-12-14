package com.fanyafeng.mapper;

import com.fanyafeng.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Author： fanyafeng
 * Data： 16/10/15 16:31
 * Email: fanyafeng@live.cn
 */
public interface IUserMapper {
    public UserModel findUserById(int id);

//    public
}
