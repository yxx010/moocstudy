package com.imooc.stage1.wrap;

public class HelloWorld {
    public static void main(String[] args) {
        //定义float类型变量，赋值为88.99
        float f1 =88.99f;
        //将基本类型转换为字符串
        String f2=Float.toString(f1);
        //打印输出
        System.out.println("f1转成String型后与整数20的求和结果为："+(f2+20));
        //定义String类型变量，赋值为"188.55"
        String str ="188.55";
        // 将字符串转换为基本类型double
        Double d1=Double.valueOf(str);
        //打印输出
        System.out.println("str转成double型后与整数20的求和结果为："+(d1+20));

    }
}