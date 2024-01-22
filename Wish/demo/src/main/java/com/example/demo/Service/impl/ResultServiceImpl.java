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
        //
        QueryWrapper <Admin> adminQueryWrapper = new QueryWrapper<Admin>();
        adminQueryWrapper.eq("username",result.getUsername1());
        Admin admin1 = adminMapper.selectOne(adminQueryWrapper);
        adminQueryWrapper.eq("username",result.getUsername2());
        Admin admin2 = adminMapper.selectOne(adminQueryWrapper);
        //
        QueryWrapper <Wish> wishQueryWrapper = new QueryWrapper<Wish>();
        wishQueryWrapper.eq("uid",admin1.getUid());
        Wish wish1 = wishMapper.selectOne(wishQueryWrapper);
        wishQueryWrapper.eq("uid",admin2.getUid());
        Wish wish2 = wishMapper.selectOne(wishQueryWrapper);
        //
        result.setWishContent1(wish1.getContent());
        result.setWishContent2(wish2.getContent());
        if (resultMapper.insert(result) > 0){
            return R.success("添加成果成功!");
        }else {
            return R.error("添加成果失败...");
        }

    }
}
