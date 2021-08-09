package com.imooc.leetcode;

import org.junit.Test;

public class Palindrome {
    //int回文检查
    //方法一，反转全部
    public boolean isPalindrome(int x) {
        int y=x;
        if(y<0) return false;
        long temp=0;
        while (y!=0){
            temp=temp*10+y%10;
            y=y/10;
        }
        System.out.println(temp);
        if(x==temp)return true;
        else return false;

    }
    //int回文检查，反转一半
    public boolean isPalindrome1(int x) {
        //小于0不是回文，等于0是回文
        if(x<0||(x/10==0&&x!=0)){
            return false;
        }
        int y=0;
        while (x>y){
            y=y*10+x%10;
            x=x/10;
        }
        return x==y||x==y/10;
    }

    public boolean isPalindrome(String str) {
        boolean res=false;
    return res;

    }

    @Test
    public void testIsPalindrome(){
        System.out.println(isPalindrome(1234554321));
        System.out.println(isPalindrome1(121));
    }
}
