package com.example.demo.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Admin;
import com.example.demo.Model.request.AdminRequest;
import com.example.demo.Mapper.AdminMapper;
import com.example.demo.Service.AdminService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper; // mybatis - plus真的是太好用！！
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public R verityPasswd(AdminRequest adminRequest) {
        adminMapper.selectList(null);
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",adminRequest.getUsername());
        queryWrapper.eq("password",adminRequest.getPassword());
        if (adminMapper.selectCount(queryWrapper) > 0) {
            return R.success("登录成功");
        } else {
            return R.error("用户名或密码错误");
        }
    }

    @Override
    public R register(AdminRequest adminRequest){
        Admin user = new Admin();
        BeanUtils.copyProperties(adminRequest,user);
        if(adminMapper.insert(user) > 0) {
            return R.success("注册成功!");
        }else {
            return R.error("注册失败!");
        }
    }
}
