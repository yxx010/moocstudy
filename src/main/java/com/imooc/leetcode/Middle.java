package com.imooc.leetcode;

import org.junit.Test;

public class Middle {
    public double getMiddle(int[] nums) {
        int len=nums.length;
        double mid=0; 
        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            System.out.print("第"+(i+1)+"次数组为：");
            for (int q = 0; q < len;q++) {
                System.out.print(nums[q]+" ");
            }
            System.out.println();
        }
        if(len%2==1){
            mid=nums[len/2];
        }else{
            System.out.println(nums[len/2-1]);
            System.out.println(nums[len/2]);
            mid=(double) (nums[len/2-1]+nums[len/2])/2;
        }
        return mid;
    }

    @Test
    public void getMiddleTest() {
        //int[] nums = {5, 2, 4, 1, 7, 6, 9};
        int [] nums={10,5,2,4,1,0};
        double mid = getMiddle(nums);
        System.out.println(mid);

    }
}
