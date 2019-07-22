package com.imooc.stage1.exam;

public class ExceptionTestDemo {
    public static void method(){
        try {
            System.out.println("try块");
            //执行完整的try catch，后面的代码不执行
            return;
        }catch (Exception e){
            System.out.println("异常发生了");
        }finally {
            System.out.println("fainally");
        }
        System.out.println("后续代码");
    }
    public static void main(String[] args) {

        method();
    }
}
