package com.imooc.stage1.method;

public class ArraySearch {
    public boolean arraySearch(int n,int[]intArry){
        boolean flag=false;
        for (int i=0;i<intArry.length;i++){
            if(n==intArry[i])
                flag=true;
        }
        return flag;
    }
    public static void main(String []args){
        int n=301;
        int [] intArry={10,20,30,40};
        ArraySearch a=new ArraySearch();
        if (a.arraySearch(n,intArry)==true)
        System.out.println("找到了");
        else
            System.out.println("没找到这个数");

    }
}
