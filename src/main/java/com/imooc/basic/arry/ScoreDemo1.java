package com.imooc.basic.arry;

import java.util.Scanner;

public class ScoreDemo1 {
    public static void main(String[] args){
        //定义一个三行两列的整型二维数组intArray
        int scoreArry[][]=new int[3][2];
        int s1=0,a1=0,s2=0,a2=0;
        Scanner sc=new Scanner(System.in);
        //从键盘输入学生成绩，要求输入顺序与效果图一致
        for(int i=0;i<scoreArry.length;i++){
            int n=i+1;
            System.out.println("请输入第"+n+"个学生的语文成绩：");
            scoreArry[i][0]=sc.nextInt();
            System.out.println("请输入第"+n+"个学生的数学成绩：");
            scoreArry[i][1]=sc.nextInt();
            s1+=scoreArry[i][0];
            s2+=scoreArry[i][1];
        }
        //求语文的总成绩和平均分
        a1=s1/3;
        System.out.println("语文的总成绩为："+s1);
        System.out.println("语文的平均成绩为："+a1);

        //求数学的总成绩和平均分
        a2=s2/3;
        System.out.println("数学的总成绩为："+s2);
        System.out.println("数学的平均成绩为："+a2);

    }
}