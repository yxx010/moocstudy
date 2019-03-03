package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {
    public static void main(String[] args) {
        int guess;
        //int number=6;
        //使用随机数 随机数默认[0,1),*10是[0,10)，*10+1[0,11)
        int number=(int)(Math.random()*10+1);
        System.out.println("随机数是："+number);
        do {
            System.out.println("请输入你要猜的数：");
            Scanner sc=new Scanner(System.in);
            guess=sc.nextInt();
            if(guess>number)
                System.out.println("太大！");
            else if (guess<number)
                    System.out.println("太小！");

        }while(guess!=number);
        System.out.println("恭喜你猜中了，答案是："+number);

    }
}
