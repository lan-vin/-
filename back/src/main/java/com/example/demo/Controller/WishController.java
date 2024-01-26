package com.example.demo.Controller;

import com.example.demo.Service.WishService;
import com.example.demo.Common.R;
import com.example.demo.Model.request.WishRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping("/wish")

public class WishController {
    @Autowired
    private WishService wishService;

    @PostMapping("/get")
    public R getOneWish(@RequestBody WishRequest wishRequest, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        System.out.println("get\n");
        return wishService.getOneWishService(wishRequest);
    }
    @PostMapping("/add")
    public R add(@RequestBody WishRequest wishRequest, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        System.out.println("add\n");
        return wishService.addWishService(wishRequest);
    }

}
