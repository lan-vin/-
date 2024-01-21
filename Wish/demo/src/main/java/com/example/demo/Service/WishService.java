package com.example.demo.Service;
import Common.R;
import com.example.demo.Model.request.WishRequest;
public interface WishService {
    R add(WishRequest wishRequest);
    R getOne(WishRequest wishRequest, HttpSession session);
}
