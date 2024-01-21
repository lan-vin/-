package com.example.demo.Controller;

import Common.R;
import com.example.demo.Model.request.AdminRequest;
import com.example.demo.Service.AdminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    // 判断是否登录成功
    @PostMapping("/admin/login")
    public R login(@RequestBody AdminRequest adminRequest, HttpSession session) {
        return adminService.verityPasswd(adminRequest, session);
    }

    @PostMapping("/admin/register")
    public R register(@RequestBody AdminRequest adminRequest){
        return adminService.register(adminRequest);
    }
}
