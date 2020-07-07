package com.webbleen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author webbleen
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("w_type")
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;


}
