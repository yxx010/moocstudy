package com.imooc.stage1.object;

public class FruitTest {
        public static void main(String[] args) {
            // 实例化2个父类对象，传入两组相同的参数值
            Fruits fru1=new Fruits("圆","甜");
            Fruits fru2=new Fruits("圆","甜");
            // 调用父类eat方法
            fru1.eat();
            // 测试重写equals方法，判断两个对象是否相等
            System.out.println("fru1与fru2的引用比较："+fru1.equals(fru2));
            System.out.println("————————————————————————————————————————");
            // 实例化子类对象，并传入相关参数值
            Waxberry waxberry=new Waxberry("圆","酸甜适中");
            waxberry.setColor("紫红");
            // 调用子类face方法和eat方法
            waxberry.face();
            waxberry.eat();
            // 测试重写toString方法，输出子类对象的信息
            System.out.println(waxberry.toString());

            System.out.println("———————————————————————————————————————-");
            // 实例化Banana类对象，并传入相关参数值
            Banana banana=new Banana("果形短而稍圆","果肉香甜","仙人蕉");
            // 调用子类的advantage和它的重载方法
            banana.advantage();
            banana.advantage("黄色");



        }

}
