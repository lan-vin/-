package com.example.demo.Service;

import com.example.demo.Common.R;
import com.example.demo.Model.domain.Admin;
import com.example.demo.Model.request.AdminRequest;
import com.baomidou.mybatisplus.extension.service.IService;
import jakarta.servlet.http.HttpSession;

// Service设计成接口是为了复用性，只给出Service接口，然后不同的人可以有不同的实现方法，是一种常见的面向接口编程
public interface AdminService extends IService<Admin>{
    R verityPasswd(AdminRequest adminRequest);
    R register(AdminRequest adminRequest);
}
