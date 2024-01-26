package com.example.demo.Controller;

import com.example.demo.Common.R;
import com.example.demo.Model.request.AdminRequest;
import com.example.demo.Service.AdminService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",maxAge=3600)
public class AdminController {
    @Autowired
    private AdminService adminService;

    // 判断是否登录成功
    @PostMapping("/admin/login")
    public R login(@RequestBody AdminRequest adminRequest, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");

        System.out.println("login\n");
        return adminService.verityPasswd(adminRequest);
    }

    @PostMapping("/admin/register")
    public R register(@RequestBody AdminRequest adminRequest,HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");

        System.out.println("register\n");
        return adminService.register(adminRequest);
    }
}
