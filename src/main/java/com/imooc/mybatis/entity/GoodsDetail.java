package com.imooc.mybatis.entity;

import lombok.Data;

@Data
public class GoodsDetail {
    private Integer gdId;
    private Integer goodsId;
    private String gdPicUrl;
    private Integer gdOrder;
    private Goods goods;
}
