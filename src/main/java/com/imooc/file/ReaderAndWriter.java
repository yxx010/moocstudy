package com.imooc.file;

import java.io.*;

public class ReaderAndWriter {
    public static void main(String[] args) {
        try {
            transWriteByBuf("test1.txt");
            transReadByBuf("test1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void transReadByBuf(String filename) throws IOException {
        FileInputStream fis=new FileInputStream(filename);
        InputStreamReader ist=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(ist);
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        ist.close();
        fis.close();
    }

    private static void transWriteByBuf(String filename) throws IOException {
        FileOutputStream fos=new FileOutputStream(filename);
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("你好吗？");
        bw.newLine();
        bw.write("我很好！");
        bw.write("\n");
        bw.write("我很好！");

        bw.close();
        osw.close();
        fos.close();
    }
}
