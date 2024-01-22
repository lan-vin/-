package com.example.demo.Service;
import com.example.demo.Common.R;
import com.example.demo.Model.request.WishRequest;
public interface WishService {
    R addWishService(WishRequest wishRequest);
    R getOneWishService();
}
