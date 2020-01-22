package com.imooc;

import org.junit.Test;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    @Test
    public void demo() {
        int nums[] = {1, 2, 7, 11, 15};
        int target = 9;
        int num[] = twoSum(nums, target);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }

    @Test
    public void demo2() {
        int x = -234400;
        String xs=String.valueOf(x);
        String s = new StringBuffer(String.valueOf(x)).reverse().toString();
        if(s.startsWith("0")){
            s.substring(1);
        }
        if(s.contains("-")){
            s=s.replace("-","");
            s="-"+s;
        }
        System.out.println(s);
        int y=Integer.parseInt(s);
        System.out.println(y);
    }

}
