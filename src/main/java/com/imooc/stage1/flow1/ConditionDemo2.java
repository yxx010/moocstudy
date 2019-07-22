package com.imooc.stage1.flow1;

import java.util.Scanner;

public class ConditionDemo2 {
    public static void main(String[] args) {
        //int n=10;
        for (int i=0;i<3;i++){
            System.out.println("请输入一个整数:");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + "是偶数");
            } else {
                System.out.println(n + "是奇数");
            }
        }
    }
}
