package com.example.demo.Service;
import Common.R;
import com.example.demo.Model.request.WishRequest;
public interface WishService {
    R addWishService(WishRequest wishRequest);
    R getAllWishService(String targetSex);
}
