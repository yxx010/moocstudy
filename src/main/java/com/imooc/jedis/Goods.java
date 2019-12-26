package com.imooc.jedis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String description;
}
