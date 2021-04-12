package com.imooc.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums[]和一个整数目标值 target，请你在该数组中找出和为目标值的两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 来源：力扣（LeetCode）
 */
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
