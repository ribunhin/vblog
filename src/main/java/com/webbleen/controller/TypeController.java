package com.webbleen.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webbleen.common.lang.Result;
import com.webbleen.entity.Type;
import com.webbleen.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("type")
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping("/index")
    public Result index(@RequestParam(defaultValue = "1") Integer currentPage) {
        Page page = new Page(currentPage, 10);
        IPage pageData = typeService.page(page);

        return Result.succ(pageData);
    }

    @GetMapping("/all")
    public Result all() {
        return Result.succ(typeService.list());
    }

    @GetMapping("/{id}")
    public Result type(@PathVariable("id") Long id) {
        return Result.succ(typeService.getById(id));
    }
}
