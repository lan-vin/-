package com.example.demo.Controller;

import com.example.demo.Service.WishService;
import com.example.demo.Common.R;
import com.example.demo.Model.request.WishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish")

public class WishController {
    @Autowired
    private WishService wishService;

    @PostMapping("/get")
    public R getOneWish(@RequestBody WishRequest wishRequest){
        return wishService.getOneWishService(wishRequest);
    }
    @PostMapping("/add")
    public R add(@RequestBody WishRequest wishRequest){
        return wishService.addWishService(wishRequest);
    }

}
