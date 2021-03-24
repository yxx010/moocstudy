package com.imooc.basic.format;

import org.junit.Test;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DayTimeUtils {
    /**
     * 获取本日剩余 秒
     *
     * @return 时间戳/1000
     */
    public static int getLastSeconds() {
        // 得到今天 晚上的最后一刻 最后时间
        String last = getTime() + " 23:59:59";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse(last, fmt);
        long latDate = parse.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        // 得到的毫秒 除以1000转换 为秒
        return (int) (latDate - System.currentTimeMillis()) / 1000;
    }

    /**
     * 获取时间 yyyy-MM-dd
     *
     * @return 时间
     */
    public static String getTime() {
        LocalDate now = LocalDate.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(fmt);
    }

    /**
     * 获取时间 yyyy-MM-dd HH:mm:ss
     *
     * @return
     */
    public static String getTimeTo() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(fmt);
    }

    /**
     * 时间戳转日期/时间
     *
     * @param seconds 时间戳
     * @param pattern 格式
     * @return
     */
    public static String timeStamp2Date(long seconds, String pattern) {
        String time = "暂无数据";
        if (StringUtils.isEmpty(pattern)) pattern = "yyyy-MM-dd  HH:mm:ss";
        LocalDateTime dateTime = LocalDateTime.ofEpochSecond(seconds / 1000L, 0, ZoneOffset.ofHours(8));
        if (seconds != 0) time = dateTime.format(DateTimeFormatter.ofPattern(pattern));
        return time;
    }

    /**
     * 日期/时间转时间戳
     *
     * @param date    时间
     * @param pattern 格式
     * @return
     */
    public static long date2TimeStamp(String date, String pattern) {
        long timeStamp;
        if (StringUtils.isEmpty(pattern)) pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        timeStamp = localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        return timeStamp;
    }

    @Test
    public  void testTime(){
        System.out.println(getLastSeconds());
        System.out.println(getTime());
        System.out.println(getTimeTo());
        System.out.println(date2TimeStamp("2021-02-12 23:23:23",null));
        System.out.println(date2TimeStamp(getTimeTo(),null));

        System.out.println(timeStamp2Date(1613143403000L,null));
    }
}
