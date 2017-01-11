package com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IVersionMapper;
import com.fanyafeng.model.VersionModel;
import com.fanyafeng.service.VersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author： fanyafeng
 * Data： 17/1/9 15:29
 * Email: fanyafeng@live.cn
 */
@Service
public class VersionServiceImpl implements VersionService {
    @Autowired
    private IVersionMapper iVersionMapper;


    @Override
    public VersionModel findVersionById(Integer id) {
        return iVersionMapper.findVersionById(id);
    }
}
