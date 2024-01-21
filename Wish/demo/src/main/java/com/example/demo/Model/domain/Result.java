package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.*;
import net.sf.jsqlparser.util.validation.metadata.DatabaseException;

import javax.xml.crypto.Data;

@TableName(value = "result")
public class Result {
    @TableId(type =  IdType.AUTO)
    private Integer id;
    private Integer uid1;
    private Integer uid2;

    private String pic;
    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Data creatTime;
}
