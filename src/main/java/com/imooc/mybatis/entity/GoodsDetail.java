package com.imooc.mybatis.entity;

import lombok.Data;

@Data
public class GoodsDetail {
    private Integer gdId;
    private Integer goodsId;
    private String gdPicUrl;
    private Integer gdOrder;
    private Goods goods;

    public Goods getGoods() {
        return goods;
    }

    public GoodsDetail setGoods(Goods goods) {
        this.goods = goods;
        return this;
    }
}
