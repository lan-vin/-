package com.example.demo.Controller;

import Common.R;
import com.example.demo.Service.UpLoadService;
import com.example.demo.Service.UpdateUserFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
import Constants.Constants;

@Repository
@RequestMapping("/avatar")
public class AvatarController {
    @Autowired
    private UpLoadService upLoadService ;

    @Autowired
    private UpdateUserFieldService updateUserFieldService;


    @PostMapping("/upload")
    public R upLoadAvatar(Integer uid, MultipartFile avatar) throws IOException {
        String originalFilename = avatar.getOriginalFilename();
        System.out.println("原始文件名: " + originalFilename);

        //断言 判断文件名是否有值 没有则抛出异常中断程序执行
        assert originalFilename != null;

        //使用UUID通用唯一识别码 + 后缀名的形式
        //设置唯一文件路径 防止文件名重复 出现覆盖的情况
        String fileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        //打印查看
        System.out.println("唯一文件名：" + fileName);

        String filePath = Constants.AVATOR_IMAGES_PATH + fileName;

        // 先将路径存储到用户的字段中
        // 直接在controller字段中操作数据库？
        R r = updateUserFieldService.UpdateField(uid,"avatar",fileName);

        //再将照片存储到本地服务器
        // 成功才将图片存储到本地服务器
        if (r.getCode() ==200){
            r = upLoadService.upLoad(filePath,avatar);
        }
        return r;
    }
}
