package com.imooc.stage1.flow1;

public class SwitchDemo {
    public static void main(String[] args) {
        //定义一个字符变量并初始化
        char ch='a';
        //使用switch结构判断是否为元音字母，并输出对应的信息
        switch (ch){
            case 'a':
                System.out.println("元音字母"+ch);
                break;
            case 'e':
                System.out.println("元音字母"+ch);
                break;
            case 'i':
                System.out.println("元音字母"+ch);
                break;
            case 'o':
                System.out.println("元音字母"+ch);
                break;
            case 'u':
                System.out.println("元音字母"+ch);
                break;
            default:
                System.out.println(ch+"不是元音字母");
        }
    }
}
