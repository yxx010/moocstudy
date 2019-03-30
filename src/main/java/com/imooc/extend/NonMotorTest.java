package com.imooc.extend;

public class NonMotorTest {
    public static void main(String[] args) {
        System.out.print("父类信息测试：");
        NonMotor nonmotor=new NonMotor("天宇","红",4,2);
        System.out.println(nonmotor.work());
        System.out.print("自行车类信息测试：");
        Bicycle bicycle=new Bicycle("捷安特","黄");
        System.out.println(bicycle.work());
        System.out.print("电动车类信息测试：");
        ElectricVehicle electricVehicle=new ElectricVehicle();
        electricVehicle.setBatteryBrand("飞鸽");
        System.out.println(electricVehicle.work());
        System.out.print("三轮车类信息测试：");
        Tricycle tricycle=new Tricycle();
        System.out.println(tricycle.work());
    }
}
