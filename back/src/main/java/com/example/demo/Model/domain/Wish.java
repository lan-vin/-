package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

@TableName(value = "wish")
public class Wish {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String content;

    private Integer sex;

    private String status;

    private String contactinfo;

    /*@TableField(fill = FieldFill.INSERT)
    private Date createTime;*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }
}
