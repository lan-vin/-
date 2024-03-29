package com.example.demo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Common.R;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


// 用于上传照片到服务器对应的文件夹
public interface UpLoadService  {
    R upLoad(String filePath, MultipartFile img) ;
}
