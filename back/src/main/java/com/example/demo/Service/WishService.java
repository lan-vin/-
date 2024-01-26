package com.example.demo.Service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Wish;
import com.example.demo.Model.request.WishRequest;
public interface WishService extends IService<Wish> {
    R addWishService(WishRequest wishRequest);
    R getOneWishService(WishRequest wishRequest);
}
