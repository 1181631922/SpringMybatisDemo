package com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author： fanyafeng
 * Data： 16/10/15 21:50
 * Email: fanyafeng@live.cn
 */
@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private IUserMapper iUserMapper;

    @Override
    public UserModel findUserById(int id) {
        return iUserMapper.findUserById(1);
    }
}
