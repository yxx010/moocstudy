package com.imooc.leetcode.linkedlist;

import com.imooc.leetcode.entity.ListNode;
import com.imooc.leetcode.utils.ArrayToNodeList;
import org.junit.Test;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val: 0;
            int n2 = l2 != null ? l2.val: 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next=new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next=new ListNode(carry);
        }
        return head;
    }

    @Test
    public void addTwoNumbersTest(){
        ArrayToNodeList arr=new ArrayToNodeList();
        ListNode l1=arr.arrayToListNode(new int[]{2,3,3});
        ListNode l2=arr.arrayToListNode(new int[]{2,7,4,1});
        ListNode l3= this.addTwoNumbers(l1,l2);
        System.out.println("两数相加结果");
        System.out.println(l3);
        System.out.println("遍历两数相加结果");
        while (l3!=null){
            System.out.println(l3.val);
            l3=l3.next;
        }

        System.out.println("测试数组转换成ListNode");
        System.out.println(arr.arrayToListNode(new int[]{2,3,4,5}));
    }


}
