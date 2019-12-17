package com.imooc.mybatis;


import com.imooc.mybatis.dao.GoodsDao;
import com.imooc.mybatis.dto.GoodsDaoDTO;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyBatisDaoTestor {

    @Test
    public void testSelectByPriceRange(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            GoodsDao goodsDao=sqlSession.getMapper(GoodsDao.class);
            List<Goods> list=goodsDao.selectByPriceRange(100f,500f,20);
            System.out.println(list.size());
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testInsert(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=new Goods();
            goods.setTitle("测试商品1");
            goods.setSubTitle("测试子标题1");
            goods.setOriginalCost(200f);
            goods.setCurrentPrice(100f);
            goods.setDiscount(0.5f);
            goods.setIsFreeDelivery(1);
            goods.setCategoryId(43);
            GoodsDao goodsDao=sqlSession.getMapper(GoodsDao.class);
            int num=goodsDao.insert(goods);
            sqlSession.commit();
            System.out.println(goods.getGoodsId());
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
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
            GoodsDao goodsDao=sqlSession.getMapper(GoodsDao.class);
            List<GoodsDaoDTO> list=goodsDao.selectAll();
            System.out.println(list.size());
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

}
