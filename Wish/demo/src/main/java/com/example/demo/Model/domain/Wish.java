package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "wish")
public class Wish {
    @TableId(type = IdType.AUTO)
    Integer id;

    Integer uid;

    Integer content;

    String sex;
}
