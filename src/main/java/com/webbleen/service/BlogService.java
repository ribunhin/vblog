package com.webbleen.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webbleen.common.dto.BlogQueryDto;
import com.webbleen.entity.Blog;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
public interface BlogService extends IService<Blog> {
    IPage<Blog> listBlog(Page page, BlogQueryDto queryDto);
}
