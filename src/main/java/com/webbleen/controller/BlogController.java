package com.webbleen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webbleen.common.lang.Result;
import com.webbleen.entity.Blog;
import com.webbleen.service.BlogService;
import com.webbleen.util.ShiroUtil;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@RestController
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/blogs")
    public Result index(@RequestParam(defaultValue = "1") Integer currentPage) {
        Page page = new Page(currentPage, 10);
        IPage pageData = blogService.page(page, new QueryWrapper<Blog>().orderByDesc("update_time"));

        return Result.succ(pageData);
    }

    @GetMapping("/blogs/{id}")
    public Result blog(@PathVariable(name = "id") Long id) {
        Blog blog = blogService.getById(id);
        Assert.notNull(blog, "该博客不存在");

        return Result.succ(blog);
    }

    @RequiresAuthentication
    @PostMapping("/admin/blogs/input")
    public Result edit(@Validated @RequestBody Blog blog) {
        Blog b;
        if (blog.getId() != null) {
            b = blogService.getById(blog.getId());
            Assert.isTrue(b.getUserId() == ShiroUtil.getProfile().getId(), "没有权限编辑");
        } else {
            b = new Blog();
            b.setUserId(ShiroUtil.getProfile().getId());
            b.setCreateTime(LocalDateTime.now());
        }

        b.setUpdateTime(LocalDateTime.now());
        BeanUtils.copyProperties(blog, b, "id", "userId", "createTime", "views");
        blogService.saveOrUpdate(b);

        return Result.succ(null);
    }

}
