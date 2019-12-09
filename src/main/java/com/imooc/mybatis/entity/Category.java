package com.imooc.mybatis.entity;

import lombok.Data;

@Data
public class Category {
    private Integer categoryId;
    private String categoryName;
    private Integer parentId;
    private Integer categoryLevel;
    private Integer categoryOrder;
}
