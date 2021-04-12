package com.imooc.leetcode.utils;

import com.imooc.leetcode.entity.ListNode;

public class ArrayToNodeList {
    public ListNode arrayToListNode(int[] s){
        ListNode l=new ListNode(s[0]);
        ListNode other=l;
        for (int i = 1; i <s.length ; i++) {
            ListNode temp=new ListNode(s[i]);
            other.setNext(temp);
            other=temp;
        }
        return l;
    }
}
