package com.webbleen.service.impl;

import com.webbleen.entity.Type;
import com.webbleen.mapper.TypeMapper;
import com.webbleen.service.TypeService;
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
public class TypeServiceImpl extends ServiceImpl<TypeMapper, Type> implements TypeService {

}
