package com.imooc.basic.set;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //用ArrayList存储学科的名称
        List list=new ArrayList();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学");
        list.add("物理");
        list.add("生物");
        //输出列表中元素的个数
        System.out.println("列表中元素的个数为："+list.size());
        //遍历输出所有列表元素
        for(int i=0;i<list.size();i++){
            System.out.println("列表中第"+(i+1)+"个元素为："+list.get(i));
        }
    }
}
