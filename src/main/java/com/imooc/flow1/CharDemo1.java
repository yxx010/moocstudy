package com.imooc.flow1;

public class CharDemo1 {
    public static void main(String[] args) {
        char ch='a';
        int count=1;
        while(ch<='z') {
            System.out.print(ch + " ");
            //打印完第13个换行继续打印
            if (count % 13 == 0)
                System.out.println();
            count++;
            ch++;
        }
    }

}
