package com.imooc.stage1.setsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        //给list添加元素
        List <String> list=new ArrayList<String>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        //输出排序前list中的内容
        System.out.println("排序前：");
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        //对list中的元素进行排序
        Collections.sort(list);
        //输出排序后list中的内容
        System.out.println("排序后：");
        for(String s:list){
            System.out.print(s+" ");
        }

    }
}

