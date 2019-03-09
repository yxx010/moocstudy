package com.imooc.method;

public class AverageDemo {
    //求数组元素的平均值
    public void avg(float[] f)
    {   float sum=0,avg=0;
        int i=0;
        for(;i<f.length;i++){
            sum+=f[i];
        }
        avg=sum/i;
        System.out.println("数组的平均值为："+avg);
    }
    public static void main(String[] args) {
        //定义对象
        AverageDemo a=new AverageDemo();
        //创建float类型的数组并初始化
        float [] f={78.5f,98.5f,65.5f,32.5f,75.5f};
        //调用方法求平均值并打印输出
        a.avg(f);

    }
}