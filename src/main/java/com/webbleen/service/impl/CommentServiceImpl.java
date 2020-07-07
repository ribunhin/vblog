package com.webbleen.service.impl;

import com.webbleen.entity.Comment;
import com.webbleen.mapper.CommentMapper;
import com.webbleen.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
