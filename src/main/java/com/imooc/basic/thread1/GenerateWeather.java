package com.imooc.basic.thread1;

public class GenerateWeather implements Runnable {
    private Weather weather;

    public GenerateWeather(Weather weather){
        setWeather(weather);
    }
    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        while (true){
            weather.generate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
