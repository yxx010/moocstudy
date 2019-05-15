package com.imooc.file;

import java.io.*;

public class FileAndBuffer {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("one.txt");
            long start=System.currentTimeMillis();
            for(int i=0;i<10000;i++){
                fos.write('a');
            }
            long end=System.currentTimeMillis();
            long time=end-start;
            System.out.println("one.txt不用缓存流写用时:"+time);
            FileOutputStream fos1=new FileOutputStream("two.txt");
            BufferedOutputStream bos1=new BufferedOutputStream(fos1);
            long start1=System.currentTimeMillis();
            for (int i = 0; i <10000 ; i++) {
                bos1.write('a');
            }
            long end1=System.currentTimeMillis();
            long time1=end1-start1;
            System.out.println("two.txt用缓存流写用时:"+time1);
            System.out.println("节省时间"+(time-time1));
            fos.close();
            //bos1引入了fos1，所以要先关闭bos1
            bos1.close();
            fos1.close();

            /*//读取时间
            FileInputStream fis=new FileInputStream("one.txt");
            long readstart=System.currentTimeMillis();
            for (int i = 0; i <1000 ; i++) {
                fis.read();
            }
            long readend=System.currentTimeMillis();
            long readtime=readend-readstart;
            System.out.println("one.txt的读取时间为："+readtime);

            FileInputStream fis1=new FileInputStream("two.txt");
            BufferedInputStream bfi1=new BufferedInputStream(fis1);
            long readstart1=System.currentTimeMillis();
            for (int i = 0; i <1000 ; i++) {
                bfi1.read();
            }
            long readend1=System.currentTimeMillis();
            long readtime1=readend-readstart;
            long time2=readtime1-readtime;
            System.out.println("two.txt缓存流读取时间为："+readtime1);
            System.out.println("节省时间"+time2);

*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
