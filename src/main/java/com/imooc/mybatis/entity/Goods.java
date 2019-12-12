package com.imooc.mybatis.entity;


import lombok.Data;

import java.util.List;

@Data
public class Goods {
    private Integer goodsId;
    private String title;
    private String subTitle;
    private Float originalCost;
    private Float currentPrice;
    private Float discount;
    private Integer isFreeDelivery;
    private Integer categoryId;
    private List<GoodsDetail> goodsDetails;

}
