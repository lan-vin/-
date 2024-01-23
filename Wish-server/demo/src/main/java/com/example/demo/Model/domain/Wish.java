package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

@TableName(value = "wish")
public class Wish {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private String content;

    private Integer sex;

    private String status;

    private String contactInfo;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
