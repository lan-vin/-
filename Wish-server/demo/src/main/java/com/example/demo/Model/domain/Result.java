package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.*;
import net.sf.jsqlparser.util.validation.metadata.DatabaseException;

import javax.xml.crypto.Data;

@TableName(value = "result")
public class Result {
    @TableId(type =  IdType.AUTO)
    private Integer id;

    private String pic;
    private String content;

    @TableField(fill = FieldFill.INSERT)
    private Data creatTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
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
