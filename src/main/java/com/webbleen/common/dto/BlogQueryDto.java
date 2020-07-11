package com.webbleen.common.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BlogQueryDto  implements Serializable {
    private String title;
    private Long typeId;
    private boolean recommend;
    private Long page;
}
