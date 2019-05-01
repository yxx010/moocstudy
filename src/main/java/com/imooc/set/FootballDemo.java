package com.imooc.set;

import java.util.*;

public class FootballDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map<Integer,String> football=new HashMap<Integer, String>();
/*        football.put(2014,"德国");
        football.put(2010,"西班牙");
        football.put(2006,"意大利");
        football.put(2002,"巴西");
        football.put(1998,"法国");
        */
        Scanner sc=new Scanner(System.in);
        //添加数据
        int i=0;
        while (i<3){
            System.out.println("请输入年份：");
            Integer key=sc.nextInt();
            System.out.println("请输入冠军：");
            String value=sc.next();
            football.put(key,value);
            i++;
        }
        //使用迭代器的方式遍历
        Iterator<String> it=football.values().iterator();
        System.out.println("使用迭代器的方式遍历：");
        while(it.hasNext()){
                System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("使用EntrySet同时获取key和value：");
        //使用EntrySet同时获取key和value
        Set<Map.Entry<Integer,String>> entrySet=football.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}

