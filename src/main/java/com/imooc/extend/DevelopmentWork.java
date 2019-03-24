package com.imooc.extend;

public class DevelopmentWork extends Work {
    // 属性：有效编码行数、目前没有解决的Bug个数
    private int codeLine;
    private int bugNum;
    //编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public DevelopmentWork(){

    }
    public DevelopmentWork(String name,int codeLine,int bugNum){
        this.setName(name);
        this.setCodeLine(codeLine);
        this.setBugNum(bugNum);

    }

    // 公有的get***/set***方法完成属性封装


    public int getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(int codeLine) {
        this.codeLine = codeLine;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**行代码，目前仍然有**个bug没有解决。其中**的数据由属性提供
    public String work() {
        String str=this.getName()+"的日报是：今天编写了"+this.getCodeLine()+"行代码，目前仍然有"
                +this.getBugNum()+"个bug没有解决。";
        return str;
    }
}

