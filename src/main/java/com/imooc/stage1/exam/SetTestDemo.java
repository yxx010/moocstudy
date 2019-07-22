package com.imooc.stage1.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTestDemo {
    public static void main(String[] args) {
//set中不能添加重复元素
        Set set=new HashSet();
        set.add("a");
        set.add("b");
        set.add("a");
        Iterator it= set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
