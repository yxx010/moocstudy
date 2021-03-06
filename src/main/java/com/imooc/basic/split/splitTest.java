package com.imooc.basic.split;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class splitTest {
    public static void main(String[] args) {
        String str="$.code:-1;$.msg:planId required;";
        Map<String,String> map=new HashMap<String, String>();
        map=split(str,";",":");
        //获得keySet，再获取value
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            System.out.println("key为："+key);
            System.out.println("值为："+map.get(key));
        }
        //同时获取k、v
        Set<Map.Entry<String, String>> entrySet=map.entrySet();
        for(Map.Entry<String,String>entry:entrySet){
            System.out.println("key为："+entry.getKey());
            System.out.println("值为："+entry.getValue());
        }


    }

    public static Map split(String str,String sp1,String sp2){
        Map<Object,Object> map=new HashMap<Object, Object>();
        String [] strArry=str.split(sp1);
        for(String string:strArry){
            String []strKeyValue=string.split(sp2);
            map.put(strKeyValue[0],strKeyValue[1]);
        }
        return map;
    }
}
