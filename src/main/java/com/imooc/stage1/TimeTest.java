package com.imooc.stage1;

public class TimeTest {

    public static void main(String[] args) {
        String timeStr;
        Long remainTime=258786966L;
        remainTime = remainTime/1000L;

        // 处理秒
        timeStr = (remainTime % 60) + "秒";
        remainTime = remainTime/60L;

        // 处理分钟
        if(remainTime > 0) {
            timeStr = (remainTime % 60) + "分" + timeStr;
            remainTime = remainTime/60L;
        }

        // 处理小时
        if(remainTime > 0) {
            timeStr = remainTime + "时" + timeStr;
        }

        //return timeStr;
        System.out.println(timeStr);
    }

   }

