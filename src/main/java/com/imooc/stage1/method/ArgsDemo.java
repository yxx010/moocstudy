package com.imooc.stage1.method;
/**可变参数,多个参数时，可变参数得放在最后一个
 * 多个相同方法都满足时，最后取可变参数所在的方法
 * */
public class ArgsDemo {
    //求和
    public void sum(int... n){
        int sum=0;
        for (int n1:n){
            sum+=n1;
        }
        System.out.println("SUM="+sum);
    }
    public static void main(String[] args) {
    ArgsDemo ad=new ArgsDemo();
    ad.sum(1,2);
    ad.sum(1);
    }
}
