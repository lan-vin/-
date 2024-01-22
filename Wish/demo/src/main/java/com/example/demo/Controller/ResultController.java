package com.example.demo.Controller;

import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Result;
import com.example.demo.Model.request.ResultRequest;
import com.example.demo.Service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/result")
public class ResultController {
    @Autowired
    private ResultService resultService;
    @GetMapping("/getResults")
    public R getResults(){
        return resultService.getResults();
    }
    @PostMapping("/addaResult")
    public R addResult(@RequestBody ResultRequest resultRequest){
        return resultService.addResult(resultRequest);
    }
}
