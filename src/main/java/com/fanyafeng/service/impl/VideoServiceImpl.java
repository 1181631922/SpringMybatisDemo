package com.fanyafeng.service.impl;

import com.fanyafeng.mapper.IUserMapper;
import com.fanyafeng.mapper.IVideosMapper;
import com.fanyafeng.model.VideosModel;
import com.fanyafeng.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 17/1/4 11:17
 * Email: fanyafeng@live.cn
 */
@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private IVideosMapper iVideosMapper;

    @Override
    public VideosModel findVideoById(Integer id) {
        return iVideosMapper.findVideoById(id);
    }

    @Override
    public List<VideosModel> findAllVideo() {
        return iVideosMapper.findAllVideo();
    }

    @Override
    public List<VideosModel> findVideoByPage(Integer page) {
        int s = page * 10;
        int e = page * 10 + 10;
        Map<String, Object> stringMap = new HashMap<>();
        stringMap.put("s", s);
        stringMap.put("e", e);
        return iVideosMapper.findVideoByPage(stringMap);
    }

    @Override
    public void insertVideo(VideosModel videosModel) {
        iVideosMapper.insertVideo(videosModel);
    }

    @Override
    public void updateVideoById(VideosModel videosModel) {
        iVideosMapper.updateVideoById(videosModel);
    }
}
