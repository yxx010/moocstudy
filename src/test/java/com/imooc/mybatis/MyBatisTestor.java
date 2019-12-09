package com.imooc.mybatis;

import com.imooc.mybatis.dto.GoodsDTO;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyBatisTestor {
    @Test
    public void testSqlSessionFactory() throws IOException {
       Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
       SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
       System.out.println("SqlSessionFactory加载成功");
       SqlSession sqlSession=null;
       try {
           sqlSession=sqlSessionFactory.openSession();
           Connection connection=sqlSession.getConnection();
           System.out.println(connection);
       }catch (Exception e){
      e.printStackTrace();
    }finally {
           if(sqlSession!=null){
               //如果type=pooled代表使用连接池，close代表放回到连接池
               //如果type=unpooled代表直连，close是真的关闭connection
               sqlSession.close();
           }
       }
       }
    @Test
    public void testMyBatisUtils(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Connection connection=sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);

        }

    }
    @Test
    public void testSelectAll(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<Goods> list=sqlSession.selectList("goods.selectAll");
            for(Goods g:list){
                System.out.println(g.getTitle()+" "+g.getGoodsId());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testSelectById(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",1602);
            System.out.println(goods.getTitle()+" "+goods.getGoodsId());
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testSelectByPriceRange(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Map map=new HashMap<>();
            map.put("min",100);
            map.put("max",500);
            map.put("limt",13);
            List<Goods> list=sqlSession.selectList("selectByPriceRange",map);
            for(Goods g:list){
                System.out.println(g.getTitle()+" "+g.getGoodsId()+" "+g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testSelectGoodsMap(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();

            List<Map> list=sqlSession.selectList("goods.selectGoodsMap");
            for(Map map:list){
                System.out.println(map);
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void selectGoodsDTO(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();

            List<GoodsDTO> list=sqlSession.selectList("goods.selectGoodsDTO");
            for(GoodsDTO goodsDTO:list){
                System.out.println(goodsDTO.getGoods().getTitle());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

}
