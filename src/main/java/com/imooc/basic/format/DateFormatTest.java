package com.imooc.basic.format;

import org.junit.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    @Test
    public void testFormat(){
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");//对日期进行格式化
        Date date = new Date();
        String str_time =df.format(date);
        System.out.println(str_time);//2020年12月11日

        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));

    }
}
