package com.fanyafeng.model;

/**
 * Author： fanyafeng
 * Data： 17/1/4 10:52
 * Email: fanyafeng@live.cn
 */
public class VideosModel extends BaseModel {
    private int id;
    private String img;
    private String video_url;
    private String title;
    private String des;
    private String header_img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getHeader_img() {
        return header_img;
    }

    public void setHeader_img(String header_img) {
        this.header_img = header_img;
    }

    @Override
    public String toString() {
        return "VideosModel{" +
                "id=" + id +
                ", img='" + img + '\'' +
                ", video_url='" + video_url + '\'' +
                ", title='" + title + '\'' +
                ", des='" + des + '\'' +
                ", header_img='" + header_img + '\'' +
                '}';
    }
}
