package com.imooc.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (map.containsKey(a) && i!= map.get(a)) {
                return new int[]{i, map.get(a)};
            }
        }
        throw new IllegalArgumentException("没有符合条件的两数");
    }

    @Test
    public void twoSumTest() {
        int[] nums = {3,3,3};
        int target = 6;
        int[] myint;
        myint = twoSum(nums, target);
        for (int i = 0; i < myint.length; i++) {
            System.out.println(myint[i]);
        }

        System.out.println(Arrays.toString(myint));
    }
}
