package com.imooc.mybatis;

import com.imooc.mybatis.entity.Classes;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.entity.GoodsDetail;
import com.imooc.mybatis.entity.Student;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MyBatisTestor1 {

    @Test
    public void testOneToMany(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<Classes> list=sqlSession.selectList("classes.selectOneToMany");
            for (Classes classes:list){
                System.out.println(classes.getClassno()+" "+classes.getStudents());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testManyToOne(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            //查询子表的唯一属性。list里用子表，查询sql也是子表。
            List<Student> list=sqlSession.selectList("student.selectManyToOne");
            for(Student student:list){
                System.out.println(student.getStuname()+" "+student.getClasses().getName()+" "+student.getClassno());
            }

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testBatchInsert(){
        SqlSession sqlSession=null;
        try{
            long st=new Date().getTime();
            sqlSession=MyBatisUtils.openSession();
            List<Student> list=new ArrayList<>();
            for (int i = 0; i <1000 ; i++) {
                Student student=new Student();
                student.setStuno("2018"+i);
                student.setStuname("测试"+i);
                student.setSex("男");
                if(i%2==0){
                    student.setClassno("Class02");
                }else{
                    student.setClassno("Class01");
                }
                list.add(student);
            }
            sqlSession.insert("student.batchInsert",list);
            Long et=new Date().getTime();
            System.out.println("执行这段时间花了"+(et-st)+"毫秒");

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
}
