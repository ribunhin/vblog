package com.webbleen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webbleen.common.lang.Result;
import com.webbleen.entity.Tag;
import com.webbleen.service.TagService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    TagService tagService;

    @GetMapping("/index")
    public Result index(@RequestParam(defaultValue = "1") Integer currentPage) {
        Page page = new Page(currentPage, 10);
        IPage pageData = tagService.page(page);

        return Result.succ(pageData);
    }

    @GetMapping("/all")
    public Result all() {
        return Result.succ(tagService.list());
    }

    @RequiresAuthentication
    @PostMapping("/input")
    public Result input(@Validated @RequestBody Tag tag) {
        Tag t = tagService.getOne(new QueryWrapper<Tag>().eq("name", tag.getName()));
        if (t != null) {
            return Result.fail("不能添加重复标签");
        }

        tagService.saveOrUpdate(tag);

        return Result.succ(null);
    }

    @GetMapping("/{id}")
    public Result type(@PathVariable("id") Long id) {
        return Result.succ(tagService.getById(id));
    }
}
