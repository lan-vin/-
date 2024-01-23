package com.example.demo.Service;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Result;
import com.example.demo.Model.request.ResultRequest;

public interface ResultService {
    R getResults();
    R addResult(ResultRequest resultRequest);
}
