package com.example.demo.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.Common.R;
import com.example.demo.Model.domain.Comment;
import com.example.demo.Model.request.CommentRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService extends IService<Comment> {
    public R addComment(CommentRequest commentRequest);
    public R deleteComment(Integer id); //根据唯一标识符删除评论
    public R addLike(Integer id);
    public R commentOfTeam(Integer TeamId);

}
