package com.webbleen.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webbleen.common.dto.BlogQueryDto;
import com.webbleen.entity.Blog;
import com.webbleen.mapper.BlogMapper;
import com.webbleen.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    public IPage<Blog> listBlog(Page page, BlogQueryDto queryDto) {
        QueryWrapper queryWrapper = new QueryWrapper<Blog>();
        if (queryDto != null) {
            if (queryDto.getTitle() != null && !"".equals(queryDto.getTitle())) {
                queryWrapper.like("title", queryDto.getTitle());
            }
            if (queryDto.getTypeId() != null) {
                queryWrapper.eq("type_id", queryDto.getTypeId());
            }
            if (queryDto.isRecommend()) {
                queryWrapper.eq("recommend", queryDto.isRecommend());
            }
        }

        queryWrapper.orderByDesc("update_time");

        return this.page(page, queryWrapper);
    }
}
