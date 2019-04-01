package com.imooc.poly;


public class AnimalTest {
    public static void main(String[] args) {
        //生成父类对象数组,数组长度为5
        Animal []animals=new Animal[5];
        //产生随机数，随机产生三种具体子类的实例
        for(int i=0;i<5;i++) {
            int rand = (int) (Math.random() * 3);
            switch (rand) {
                case 0:
                    animals[i] = new Dog("小狗");
                    break;
                case 1:
                    animals[i]=new Cat("小猫");
                    break;
                case 2:
                    animals[i]=new Sheep("小羊");
                    break;
            }
            animals[i].cry();
        }

        //循环输出，循环体中每个对象分别调用cry()方法。
       // for (int i=0;i<5;i++){
        //    animals[i].cry();
       // }

    }
}
