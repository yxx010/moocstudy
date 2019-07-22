package com.imooc.stage1.extend1;

public class WorkTest {
    public static void main(String[] args) {
        Work w=new Work();
        TestWork tw=new TestWork("测试工作",10,5);
        DevelopmentWork dw=new DevelopmentWork("开发工作",1000,10);
        System.out.print("父类信息测试：");
        System.out.println(w.work());
        System.out.print("测试工作类信息测试：");
        System.out.println(tw.work());
        System.out.print("研发工作类信息测试：");
        System.out.println(dw.work());
    }
}
