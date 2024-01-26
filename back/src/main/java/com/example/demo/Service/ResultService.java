package com.example.demo.Service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Result;
import com.example.demo.Model.request.ResultRequest;

public interface ResultService extends IService<Result> {
    R getResults();
    R addResult(ResultRequest resultRequest);
}
