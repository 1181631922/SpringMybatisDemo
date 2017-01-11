package com.fanyafeng.mapper;

import com.fanyafeng.model.VideosModel;

import java.util.List;
import java.util.Map;

/**
 * Author： fanyafeng
 * Data： 17/1/4 11:09
 * Email: fanyafeng@live.cn
 */
public interface IVideosMapper {
    public VideosModel findVideoById(Integer id);

    public List<VideosModel> findAllVideo();

    public List<VideosModel> findVideoByPage(Map map);

    public void insertVideo(VideosModel videosModel);

    public void updateVideoById(VideosModel videosModel);
}
