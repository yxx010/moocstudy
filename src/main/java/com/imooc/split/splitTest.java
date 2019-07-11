package com.imooc.split;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class splitTest {
    public static void main(String[] args) {
        String str="$.code:-1;$.msg:planId required;";
        Map<Object,Object> map=new HashMap<>();
        map=split(str,";",":");
        //获得keySet，再获取value
        Set<Object> keySet=map.keySet();
        for(Object key:keySet){
            System.out.println("key为："+key);
            System.out.println("值为："+map.get(key));
        }
        //同时获取k、v
        Set<Map.Entry<Object, Object>> entrySet=map.entrySet();
        for(Map.Entry<Object,Object>entry:entrySet){
            System.out.println("key为："+entry.getKey());
            System.out.println("值为："+entry.getValue());
        }


    }

    public static Map split(String str,String sp1,String sp2){
        Map<Object,Object> map=new HashMap<>();
        String [] strArry=str.split(sp1);
        for(String string:strArry){
            String []strKeyValue=string.split(sp2);
            map.put(strKeyValue[0],strKeyValue[1]);
        }
        return map;
    }
}
