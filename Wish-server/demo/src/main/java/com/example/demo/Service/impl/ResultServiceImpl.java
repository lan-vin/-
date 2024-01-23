package com.example.demo.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Common.R;
import com.example.demo.Mapper.AdminMapper;
import com.example.demo.Mapper.ResultMapper;
import com.example.demo.Mapper.WishMapper;
import com.example.demo.Model.domain.Admin;
import com.example.demo.Model.domain.Result;
import com.example.demo.Model.domain.Wish;
import com.example.demo.Model.request.ResultRequest;
import com.example.demo.Service.ResultService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class ResultServiceImpl implements ResultService {
    @Autowired
    private ResultMapper resultMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private WishMapper wishMapper;
    @Override
    public R getResults() {
        QueryWrapper < Result > queryWrapper = new QueryWrapper<Result>();
        return R.success(null,resultMapper.selectList(queryWrapper));
    }

    @Override
    public R addResult(ResultRequest resultRequest) {
        Result result = new Result();
        BeanUtils.copyProperties(resultRequest,result);
        String filePath = "/data/Img";
        File saveAddress = new File(filePath);
        if (!saveAddress.exists()) {
            saveAddress.mkdirs();// 如果文件夹不存在 创建保存文件对应的文件夹
        }
        String dst = filePath + File.separator + resultRequest.getImg().getOriginalFilename();
        result.setPic(dst);
        // 将上传的文件保存到指定路径
        try{
            resultRequest.getImg().transferTo(new File(dst));
        }catch (IOException e){
            return R.error("上传图片失败!");
        }
        if (resultMapper.insert(result) > 0){
            return R.success("添加成果成功!");
        }else {
            return R.error("添加成果失败...");
        }

    }
}
