package com.imooc.stage2.step3.xml;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class PlanReader {
    public void readXml(){
        String file="plan.xml";
        //读取XML文件的核心类
        SAXReader reader=new SAXReader();
        try {
            Document document = reader.read(file);
            //获取根节点 所有标签都是element
            Element root=document.getRootElement();
            //获取指定的标签集合
            List <Element> items= root.elements("item");
            for (Element item:items) {
               Element courseName=item.element("course-name");
               String name=courseName.getText();
                System.out.println(name);
                System.out.println(item.elementText("class-hour"));
                System.out.println(item.elementText("exam-form"));
                Attribute att=item.attribute("no");
                System.out.println(att.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PlanReader reader=new PlanReader();
        reader.readXml();
    }
}
