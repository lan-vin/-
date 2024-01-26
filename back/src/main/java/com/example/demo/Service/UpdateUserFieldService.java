package com.example.demo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import  com.example.demo.Common.R;
import com.example.demo.Model.domain.Admin;

public interface UpdateUserFieldService extends IService<Admin> {
    R UpdateField(Integer uid,String FieldName, String value);
}
