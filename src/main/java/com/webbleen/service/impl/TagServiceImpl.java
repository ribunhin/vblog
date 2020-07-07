package com.webbleen.service.impl;

import com.webbleen.entity.Tag;
import com.webbleen.mapper.TagMapper;
import com.webbleen.service.TagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
