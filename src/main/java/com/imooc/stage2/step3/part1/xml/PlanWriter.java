package com.imooc.stage2.step3.part1.xml;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PlanWriter {
    public void writeXml(){
        String file="plan.xml";
        SAXReader reader=new SAXReader();
        try {
            Document document=reader.read(file);
            Element root=document.getRootElement();
            Element item=root.addElement("item");
            item.addAttribute("no","4");
            Element name=item.addElement("course-name");
            name.setText("舞蹈");
            Element hour=item.addElement("class-hour");
            hour.setText("20");
            Element exam=item.addElement("exam-form");
            exam.setText("不考试");
            Writer writer=new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
            document.write(writer);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PlanWriter planWriter=new PlanWriter();
        planWriter.writeXml();
    }
}
