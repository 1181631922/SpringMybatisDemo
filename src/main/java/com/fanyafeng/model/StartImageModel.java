package com.fanyafeng.model;

/**
 * Author： fanyafeng
 * Data： 17/1/13 10:28
 * Email: fanyafeng@live.cn
 */
public class StartImageModel {
    private int id;
    private String img_url;
    private String link_url;
    private int seconds;
    private String type;
    private boolean is_show;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean is_show() {
        return is_show;
    }

    public void setIs_show(boolean is_show) {
        this.is_show = is_show;
    }

    @Override
    public String toString() {
        return "StartImageModel{" +
                "id=" + id +
                ", img_url='" + img_url + '\'' +
                ", link_url='" + link_url + '\'' +
                ", seconds=" + seconds +
                ", type='" + type + '\'' +
                ", is_show=" + is_show +
                '}';
    }
}
