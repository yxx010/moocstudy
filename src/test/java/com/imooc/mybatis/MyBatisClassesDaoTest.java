package com.imooc.mybatis;

import com.imooc.mybatis.entity.Classes;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/*@Autowired
private ClassesDao classesDao;

public class MyBatisClassesDaoTest {
    @Test
  public void demo(){
        public void testSelectById(){
            SqlSession sqlSession=null;
            try {
                sqlSession= MyBatisUtils.openSession();
                Classes classes=classesDao.selectOneToMany();
                System.out.println(classes);
            }catch (Exception e){
                throw e;
            }finally {
                MyBatisUtils.closeSession(sqlSession);
            }
        }
  }
}*/
