package com.yy.test.dubbodemo.domin;

import java.io.Serializable;

/**
 * @author liujianfeng
 * @date 2018/1/12 17:03
 */
public class User implements Serializable{

    private String uid;

    private String name;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
