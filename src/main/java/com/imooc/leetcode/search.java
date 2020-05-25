package com.imooc.leetcode;

import org.junit.Test;

public class search {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return -1;

    }

    @Test
    public void searchTest() {
        int [] nums={1,5,9,33};
        int c=search(nums,10);
        System.out.println(c);
    }
}
