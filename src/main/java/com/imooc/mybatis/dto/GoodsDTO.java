package com.imooc.mybatis.dto;

import com.imooc.mybatis.entity.Category;
import com.imooc.mybatis.entity.Goods;
import lombok.Data;

@Data
public class GoodsDTO {
    private Goods goods=new Goods();
    private Category category=new Category();
    private String test;

}
