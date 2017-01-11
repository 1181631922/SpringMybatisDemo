package com.fanyafeng.service;

import com.fanyafeng.model.VideosModel;

import java.util.List;

/**
 * Author： fanyafeng
 * Data： 17/1/4 11:16
 * Email: fanyafeng@live.cn
 */
public interface VideoService {
    public VideosModel findVideoById(Integer id);

    public List<VideosModel> findAllVideo();

    public List<VideosModel> findVideoByPage(Integer id);

    public void insertVideo(VideosModel videosModel);

    public void updateVideoById(VideosModel videosModel);
}
