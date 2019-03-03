package com.imooc.flow1;

import java.util.Scanner;

public class ScoreAssess {
    public static void main(String[] args) {
        float score;
        System.out.println("请输入分数：");
        Scanner sc=new Scanner(System.in);
        score=sc.nextFloat();
        if(score>=90)
        System.out.println(score+"大于等于90为优秀");
        else if (score>=80)
        System.out.println(score+"大于等于80为良好");
        else if (score>=60)
        System.out.println(score+"大于等于60为合格");
        else
        System.out.println(score+"小于60为不及格");

    }
}
