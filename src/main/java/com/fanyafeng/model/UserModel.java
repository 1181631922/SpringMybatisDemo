package com.fanyafeng.model;

import java.util.Date;

/**
 * Author： fanyafeng
 * Data： 16/10/15 16:29
 * Email: fanyafeng@live.cn
 */
public class UserModel extends BaseModel {
    private int id;
    private String username;
    private Date date;
    private String sex;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
