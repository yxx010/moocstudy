package com.imooc;

/*基本类型	大小	取值范围	装箱基本类型
        char	2个字节	 	Character
        byte	1个字节	-2^7 ~ 2^7-1	Byte
        short	2个字节	-2^15 ~ 2^15-1	Short
        int	    4个字节	-2^31 ~ 2^31-1	Integer
        long	8个字节	-2^63 ~ 2^63-1	Long
        float	4个字节	 	Float
        double	8个字节	 	Double
        boolean	1或者4个字节	true ~ false	Boolean
*/
public class TypeExchange {
    public static void main(String[] args) {
        char c=(char)67832;
        System.out.println("c="+c);
        //定义一个整型变量n，值为65
        int n=65;
        //定义一个字符型变量c1，赋值为n，并输出c1的值
        char c1=(char)n;
        System.out.println("c1="+c1);
        //定义一个长整型变量l，值为987654321
        long l=987654321;
        //定义一个整型变量i，赋值为l，并输出i的值
        int i=(int)l;
        System.out.println("i="+i);
        //定义一个float类型变量f，将变量l的值赋值给f，并输出f的值
        float f=(float)l;
        System.out.println("f="+f);
        //将float的值f，重新赋值给变量l，并输出l的值
        l=(long)f;
        System.out.println("l="+l);
    }
}
