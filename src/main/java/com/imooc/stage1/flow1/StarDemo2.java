package com.imooc.stage1.flow1;

public class StarDemo2 {
    public static void main(String[] args) {
        int n=4;//空格的最大个数 11-2*n为*的个数
        for(int l=0;l<=4;l++){
            for (int i=0;i<n;i++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<11-2*n;j++)
            {
                System.out.print("*");
            }
            for (int i=0;i<n;i++)
            {
                System.out.print(" ");
            }
            n--;
            System.out.println();
        }
    }
}
