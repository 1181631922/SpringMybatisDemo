package com.fanyafeng.model;

/**
 * Author： fanyafeng
 * Data： 17/1/9 15:24
 * Email: fanyafeng@live.cn
 */
public class VersionModel {
    private int id;
    private int version_code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVersion_code() {
        return version_code;
    }

    public void setVersion_code(int version_code) {
        this.version_code = version_code;
    }

    @Override
    public String toString() {
        return "VersionModel{" +
                "id=" + id +
                ", version_code=" + version_code +
                '}';
    }
}
