package com.imooc.stage1.file;

import java.io.*;
import java.util.Objects;
/**
 * 《对象的序列化与反序列化》
 * 一、对象序列化
 * 1、步骤
 * ①创建一个类，继承Serializable接口
 * ②创建对象
 * ③将对象写入文件
 * ④从文件读取对象信息
 * ⑤对象的读写涉及到两个类：
 * ·对象输入流ObjectInputStream
 * ·对象输出流ObjectOutputStream
 * 二、ObjectOutputStream
 * 1、构造方法
 * ①无参构造方法ObjectOutputStream()
 * ②ObjectOutputStream(OutputStream out)
 * 2、常用方法
 * ①close()
 * ②flush()
 * ③各种write方法，除其他输出流类的write方法外，还支持各种基本数据类型以及对象，重点是writeObject(Object obj)
 * 三、ObjectInputStream
 * 1、构造方法
 * ①无参构造方法ObjectInputStream()
 * ②带参构造方法ObjectInputStream(InputStream in)
 * 2、常用方法
 * ①close()
 * ②read方法和ObjectOutputStream中write()方法一样，可以读取各种基本数据类型的数据，还可以读取行readLine()，也支持读取对象。readObject()和writeObject()是成对使用的。读取出来后是Object类的对象，需要进行强制类型转换。
 * 注意：读顺序应该和写顺序是一样的，不能先写入对象，再写入boolean类型；读取的时候却是先读boolean类型，再读对象。
 *
 * 序列化：把Java对象转换成字节序列的过程
 * 反序列化：把字节序列恢复为Java对象的过程
 */
class ProductSerializable implements Serializable{

    private String ID;
    private String name;
    private String categories;
    private double price;

    public ProductSerializable(String ID, String name, String categories, double price) {
        this.ID = ID;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSerializable product = (ProductSerializable) o;
        return Objects.equals(ID, product.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "产品ID：" + ID  +
                "\n产品名称：" + name+
                "\n产品属性：" + categories+
                "\n产品价格：" + price+"元";
    }
}
public class ProdctTest {
    public static void main(String[] args) {
        ProductSerializable iphone=new ProductSerializable("123","iphone","telephone",4888);
        ProductSerializable ipad=new ProductSerializable("234","ipad","computer",5088);
        ProductSerializable macbook=new ProductSerializable("345","macbook","computer",10688);
        ProductSerializable iwatch=new ProductSerializable("256","iwatch","watch",4799);
        try {
            FileOutputStream fos=new FileOutputStream("product.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(iphone);
            oos.writeObject(ipad);
            oos.writeObject(macbook);
            oos.writeObject(iwatch);
            oos.writeObject(null);
            oos.close();
            fos.close();
            FileInputStream fis=new FileInputStream("product.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ProductSerializable products;
            System.out.println("Apple系列产品信息：");
            while ((products=(ProductSerializable) ois.readObject())!=null){
                System.out.println(products);
                System.out.println();
            }
            ois.close();
            fis.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
