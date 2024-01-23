package com.example.demo.Service.impl;

import com.example.demo.Common.R;
import com.example.demo.Service.UpLoadService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UpLoadServiceImpl implements UpLoadService {
    public R upLoad(String filePath, MultipartFile img) {
        //根据上传路径创建文件夹File对象
        File saveAddress = new File(filePath);
        if (!saveAddress.exists()) {
            saveAddress.mkdirs();// 如果文件夹不存在 创建保存文件对应的文件夹
        }
        // 将上传的文件保存到指定路径
        try{
            img.transferTo(new File(filePath + File.separator + img.getOriginalFilename()));
        }catch (IOException e){
            return R.error("上传图片失败!");
        }
        return R.ok();
    }
}
