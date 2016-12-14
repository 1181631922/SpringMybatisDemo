package com.fanyafeng.model;

/**
 * Author： fanyafeng
 * Data： 16/12/7 15:26
 * Email: fanyafeng@live.cn
 */
public class UserCustomModel extends UserModel{
    private int userId;
    private String passWord;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserCustomModel{" +
                "userId=" + userId +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
