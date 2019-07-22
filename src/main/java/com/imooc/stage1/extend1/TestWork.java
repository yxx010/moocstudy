package com.imooc.stage1.extend1;


public class TestWork extends Work {
    //属性：编写的测试用例个数、发现的Bug数量
    private int caseNum;
    private int bugNum;
    // 编写构造方法，并调用父类相关赋值方法，完成属性赋值
    public TestWork(){

    }
    public TestWork(String name,int caseNum,int bugNum){
        this.setName(name);
        this.setCaseNum(caseNum);
        this.setBugNum(bugNum);
    }

    // 公有的get***/set***方法完成属性封装

    public int getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(int caseNum) {
        this.caseNum = caseNum;
    }

    public int getBugNum() {
        return bugNum;
    }

    public void setBugNum(int bugNum) {
        this.bugNum = bugNum;
    }

    // 重写运行方法，描述内容为：**的日报是：今天编写了**个测试用例，发现了**bug。其中**的数据由属性提供
    public String work() {
        String str=this.getName()+"的日报是：今天编写了"+this.getCaseNum()+"个测试用例，发现了"
                +this.getBugNum()+"个bug。";
        return str;

    }
}

