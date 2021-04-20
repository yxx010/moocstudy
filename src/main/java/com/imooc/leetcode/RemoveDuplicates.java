package com.imooc.leetcode;

import org.junit.Test;

public class RemoveDuplicates {
    public int removeDuplicates(int [] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    @Test
    public void  test(){
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int len=removeDuplicates(nums);
        for (int i = 0; i <len ; i++) {
            System.out.println(nums[i]);
        }
    }
}
