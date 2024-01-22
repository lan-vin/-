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
    private Integer username1;
    private Integer username2;

    private MultipartFile img;
    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Data creatTime;
}
