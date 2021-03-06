package com.imooc.web.step3.xml;

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
                System.out.println("-----------------");

            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        XPathTest test=new XPathTest();
        System.out.println("所有课程信息如下：");
        System.out.println("******************");
        test.xpath("/plan/item");
        //test.xpath("//item");
        System.out.println("课时小于50的课程：");
        System.out.println("******************");
        test.xpath("//item[class-hour<50]");
        System.out.println("课程名为高等数学：");
        System.out.println("******************");
        test.xpath("//item[course-name='高等数学']");
        System.out.println("属性为001的课程");
        System.out.println("******************");
        test.xpath("//item[@no='001']");
       // test.xpath("//item[last]");
        System.out.println("前两条课程信息：");
        System.out.println("******************");
        test.xpath("//item[position()<3]");

        //test.xpath("//item[1] |//item[2]");
        System.out.println("第一个和最后一个课程信息：");
        System.out.println("******************");
        test.xpath("//item[1]");
        test.xpath("//item[last()]");




    }
}
