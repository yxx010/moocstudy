package com.imooc.set;

import java.util.*;

public class FootballMapDemo {
    public static void main(String[] args) {
        //定义HashMap的对象并添加数据
        Map<Integer,String> football=new HashMap<Integer, String>();
        football.put(2014,"德国");
        football.put(2010,"西班牙");
        football.put(2006,"意大利");
        football.put(2002,"巴西");
        football.put(1998,"法国");


        //添加数据，通过键盘输入方式
        /*
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (i<3){
            System.out.println("请输入年份：");
            Integer key=sc.nextInt();
            System.out.println("请输入冠军：");
            String value=sc.next();
            football.put(key,value);
            i++;
        }*/
        //使用迭代器的方式遍历value
        Iterator<String> it=football.values().iterator();
        System.out.println("使用迭代器的方式遍历value：");
        while(it.hasNext()){
                System.out.print(it.next()+" ");
        }
        System.out.println();
        //使用迭代器方式遍历key
        Iterator<Integer> itKey=football.keySet().iterator();
        System.out.println("使用迭代器的方式遍历key：");
        while(itKey.hasNext()){
            System.out.print(itKey.next()+" ");
        }
        System.out.println();
        //使用keySet获取key，再获取value
        System.out.println("使用keySet获取key，再获取value");
        Set<Integer> keySet=football.keySet();
        for(Integer key:keySet){
            System.out.println(key+"："+football.get(key));

        }
        System.out.println("使用EntrySet同时获取key和value：");
        //使用EntrySet同时获取key和value
        Set<Map.Entry<Integer,String>> entrySet=football.entrySet();
        for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }

    }
}

