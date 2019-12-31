package com.imooc.ioc.demo1;

import lombok.Data;

@Data
public class Food {
    private String name;
    private String taste;
    private String kind;

    @Override
    public String toString() {
        return name + "属于" +kind+",口味" + taste;
    }
}
