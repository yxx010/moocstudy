package com.imooc.stage1.thread1;

public class Weather {
    private int temperature;
    private int humidity;
    private boolean flag=false;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public synchronized void generate(){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        setTemperature((int)(Math.random()*40+1));
        setHumidity((int)(Math.random()*100+1));
        System.out.println("生成"+this);
        flag=true;//生成完毕，容器中有数据
        notifyAll();
    }
    public synchronized void read(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        getTemperature();
        getHumidity();
        System.out.println("获取"+this);
        flag=false;//消费完毕，容器中没有数据
        notifyAll();
    }

    @Override
    public String toString() {
        return "天气数据[" +
                "温度：" + temperature +
                ", 湿度：" + humidity +
                ']';
    }
}
