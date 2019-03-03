package com.imooc.flow1;

public class JieChengPlus {
    public static void main(String[] args) {
        int sum=0;
        //1到4的阶乘
        //!1=1 !2=1*2 !3=1*2*3 !4=1*2*3*4
        for (int i=1;i<=4;i++){
          int s=1;
          for(int j=1;j<=i;j++){
              s=s*j;
          }
          sum=s+sum;
        }
        System.out.println("阶乘为："+sum);
    }
}
