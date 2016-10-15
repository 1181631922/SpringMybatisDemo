package com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.model.UserModel;
import com.fanyafeng.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * Author： fanyafeng
 * Data： 16/10/15 21:50
 * Email: fanyafeng@live.cn
 */
public class UserServiceImpl extends SqlSessionDaoSupport implements UserService {

    @Resource
    private IUserMapper iUserMapper;
    @Override
    public UserModel findUserById(int id) {
//        SqlSession sqlSession = this.getSqlSession();
//        UserModel userModel = sqlSession.selectOne("com.fanyafeng.mapper.IUserMapper.findUserById", id);
        UserModel userModel = iUserMapper.findUserById(id);
        return userModel;
    }
}
