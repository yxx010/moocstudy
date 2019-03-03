package com.imooc.flow1;
/*打印梯形
    ***
   *****
  *******
 *********
***********
1、外重循环控制输出行数
2、第一个内重循环控制输出的空格数，依次递减。
注意：由于星号和空格在屏幕上所占的空间不同，所以可以适当调整空格的输出，
比如每次循环都输出两个空格。这样输出来的图形会更加接近梯形
3、第二个内重循环控制每行输出的星号数
4、输出完一行的星号和空格后换行
*/
public class StarDemo {
    public static void main(String[] args) {
        for(int n=4;n>=0;n--){
            for (int i=0;i<n;i++)
            {
                System.out.print(" ");
            }
            for (int j=0;j<11-2*n;j++)
            {
                System.out.print("*");
            }
            for (int k=0;k<n;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
