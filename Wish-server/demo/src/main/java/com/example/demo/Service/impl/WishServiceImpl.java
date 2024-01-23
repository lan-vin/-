package com.example.demo.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Wish;
import com.example.demo.Model.request.WishRequest;
import com.example.demo.Service.WishService;
import com.example.demo.Mapper.WishMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {
    @Autowired
    private WishMapper wishMapper;
    @Override
    public R getOneWishService(WishRequest wishRequest){
        QueryWrapper<Wish> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("status","valid");
        queryWrapper.eq("sex",wishRequest.getSex());
        if(wishMapper.selectList(queryWrapper).isEmpty()){
            return R.error("暂无可选心愿！");
        }else{
            int length=wishMapper.selectList(queryWrapper).size();
            int random=(int)(Math.random()*length);//暂时先用随机数生成
            Wish select=wishMapper.selectList(queryWrapper).get(random);
            UpdateWrapper<Wish> updatewrapper=new UpdateWrapper<>();
            updatewrapper.set("status","finished").eq("id",select.getId());
            wishMapper.update(null,updatewrapper);
            return R.success("心愿如下！",select);
        }

    }

    public R addWishService(WishRequest wishRequest){
        Wish wish=new Wish();
        BeanUtils.copyProperties(wishRequest,wish);
        if(wishMapper.insert(wish) > 0) {
            wish.setStatus("valid");
            return R.success("添加成功!");
        }else {
            return R.error("添加失败!");
        }
    }
}
