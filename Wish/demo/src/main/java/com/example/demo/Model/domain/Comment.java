package com.example.demo.Model.domain;

import Common.R;
import com.example.demo.Service.CommentService;
import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@TableName(value = "comment")
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer TeamId;

    private String content; // 评论的内容

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Integer up; // 点赞的数量
}
