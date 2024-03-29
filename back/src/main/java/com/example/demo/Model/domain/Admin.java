package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

// TableName 需要引入mybatis-plus
@TableName(value = "admin")
// 这个对象也对应一个表中存储的对象
public class Admin {
    @TableId(type = IdType.AUTO) // 声明这个为数据库中的主键， 后面的AUTO代表主键自动增长（唯一标识数据库中的数据）
    private Integer id;

    private String username;

    private String password;
    private Integer sex;

    // 下面用于存储头像信息
    private String avatar; // 头像地址

    public Integer getId() {
        return id;
    }

    public void setId(Integer uid) {
        this.id = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
