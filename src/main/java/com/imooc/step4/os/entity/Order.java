package com.imooc.step4.os.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private String id;
    private String productsId;
    private int number;
    private double price;
    private Date createTime;
    private Date sendTime;
    private Date confirmTime;
    private String consignee;
    private String consigneePhone;
    private String consigneeAddress;
    private String status;
    public Order(String id, String productsId, int number, double price, String consignee, String consigneePhone, String consigneeAddress) {
        this.id = id;
        this.productsId = productsId;
        this.number = number;
        this.price = price;
        this.consignee = consignee;
        this.consigneePhone = consigneePhone;
        this.consigneeAddress = consigneeAddress;
    }

}
