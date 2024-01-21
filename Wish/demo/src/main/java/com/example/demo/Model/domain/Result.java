package com.example.demo.Model.domain;

import com.baomidou.mybatisplus.annotation.*;
import net.sf.jsqlparser.util.validation.metadata.DatabaseException;

import javax.xml.crypto.Data;

@TableName(value = "result")
public class Result {
    @TableId(type =  IdType.AUTO)
    private Integer id;
    private String username1;
    private String username2;

    private String wishContent1;
    private String wishContent2;

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

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    public String getWishContent1() {
        return wishContent1;
    }

    public void setWishContent1(String wishContent1) {
        this.wishContent1 = wishContent1;
    }

    public String getWishContent2() {
        return wishContent2;
    }

    public void setWishContent2(String wishContent2) {
        this.wishContent2 = wishContent2;
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
