package com.imooc.stage2.step3.part1.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XPathTest {
    public void xpath(String xpathExp){
        String file="plan.xml";
        SAXReader reader=new SAXReader();
        try {
            Document document=reader.read(file);
            List<Node> nodes=document.selectNodes(xpathExp);
            for (Node node:nodes){
                Element element=(Element)node;
                System.out.println(element.attributeValue("no"));
                System.out.println(element.elementText("course-name"));
                System.out.println(element.elementText("class-hour"));
                System.out.println(element.elementText("exam-form"));
                System.out.println("===================");

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        XPathTest test=new XPathTest();
        //test.xpath("/plan/item");
        //test.xpath("//item");
        test.xpath("//item[class-hour>100]");
        test.xpath("//item[course-name='大学英语']");
        test.xpath("//item[@no='2']");
        test.xpath("//item[last]");
        test.xpath("//item[position<2]");




    }
}
