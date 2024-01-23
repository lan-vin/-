package com.example.demo.Service.impl;

import com.example.demo.Common.R;
import com.example.demo.Mapper.AdminMapper;
import com.example.demo.Model.domain.Admin;
import com.example.demo.Service.UpdateUserFieldService;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserFieldServiceImpl implements UpdateUserFieldService {
    @Autowired
    AdminMapper updateUserFieldMapper;
    @Override
    public R UpdateField(Integer uid,String FieldName, String value){
        UpdateWrapper < Admin > updateWrapper = new UpdateWrapper<Admin>();
        updateWrapper.eq("id",uid).set(FieldName, value);
        if (updateUserFieldMapper.update(null, updateWrapper) > 0){
            return R.success("更新成功!");
        }else {
            return R.error("上传失败！");
        }
    }
}
