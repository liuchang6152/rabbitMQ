package com.liuchang.pojo;

import java.io.Serializable;

/**
 * @ Author     ：liuchang
 * @ Date       ：Created in 14:54 2019/11/29
 * @ Description：
 * @ Modified By：
 */
public class User implements Serializable {
    private String id;
    private String name;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
