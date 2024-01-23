package com.example.demo.Model.request;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.crypto.Data;

public class ResultRequest {
    @TableId(type =  IdType.AUTO)
    private Integer id;

    private MultipartFile img;
    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Data creatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MultipartFile getImg() {
        return img;
    }

    public void setImg(MultipartFile img) {
        this.img = img;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Data getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Data creatTime) {
        this.creatTime = creatTime;
    }
}
