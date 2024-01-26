package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Result;
import com.example.demo.Model.request.ResultRequest;
import com.example.demo.Service.ResultService;
import com.example.demo.Service.UpLoadService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultService resultService;
    @Autowired
    private UpLoadService upLoadService;
    @GetMapping("/getresults")
    public R getResults(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        System.out.println("getre\n");
        return resultService.getResults();
    }
    @PostMapping("/addresult")
    public R addResult(@RequestBody ResultRequest resultRequest, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");
        System.out.println("addre\n");
        return resultService.addResult(resultRequest);
    }
}
