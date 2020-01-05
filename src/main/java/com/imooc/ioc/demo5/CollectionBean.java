package com.imooc.ioc.demo5;

import lombok.Data;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class CollectionBean {
    private String[] arrs;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;
}
