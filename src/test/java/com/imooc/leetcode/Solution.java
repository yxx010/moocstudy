package com.imooc.leetcode;

import org.junit.Test;

import java.util.*;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    @Test
    public void demo() {
        int nums[] = {1, 2, 7, 11, 15};
        int target = 9;
        int num[] = twoSum(nums, target);
        for (int i = 0; i < num.length; i++) {
            System.out.println("两数之和的数组下标为：" + num[i]);
        }
    }

    @Test
    public void demo2() {
        int x = -234400;
        String xs = String.valueOf(x);
        String s = new StringBuffer(String.valueOf(x)).reverse().toString();
        if (s.startsWith("0")) {
            s.substring(1);
        }
        if (s.contains("-")) {
            s = s.replace("-", "");
            s = "-" + s;
        }
        System.out.println("数字反转中间值：" + s);
        int y = Integer.parseInt(s);
        System.out.println("数字反转最终值：" + y);
    }

    /**
     * 统计字母的个数（忽略大小写，不含数字）
     */
    @Test
    public void demo4() {

        String str = "LLTabcdsssdddtt123uvwabxyA";
        String str1 = "ab";
        str = str.toUpperCase();
        System.out.println(str);
        Map<String, Integer> map = new HashMap();
        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                String s = String.valueOf(ch);
                if (!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    Integer count = map.get(s);
                    count++;
                    map.put(s, count);
                }
            }
        }
        System.out.println(map);
    }

    @Test
    public void demo5() {
        String str = "aaabcaad  ";
        String str1 = "aa";
        int count = 0;
        while (str.indexOf(str1) != -1) {
            count++;
            int index = str.indexOf(str1);
            str = str.substring(index + 1);
            System.out.println(str);
        }
        System.out.println(count);
    }

    public int lengthOfLastWord(String s) {
        int index = s.lastIndexOf(" ");
        if(index+1==s.length()){
            s=s.substring(0,index);
            int index1=s.lastIndexOf(" ");
            return s.substring(index1+1).length();
        }
        return s.substring(index + 1).length();
    }

    @Test
    public void testLengthOfLastWord() {
        System.out.println(lengthOfLastWord("b   a    "));
        System.out.println("hi ni nop ".length());
    }
}
