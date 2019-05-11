package com.imooc.thread1;

public class ReadWeather implements Runnable {
    Weather weather;
    public ReadWeather(Weather weather){
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
        while(true){
            weather.read();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
