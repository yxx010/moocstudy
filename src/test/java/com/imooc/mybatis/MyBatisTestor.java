package com.imooc.mybatis;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.imooc.mybatis.dto.GoodsDTO;
import com.imooc.mybatis.entity.Goods;
import com.imooc.mybatis.entity.GoodsDetail;
import com.imooc.mybatis.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.*;


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
            int num=sqlSession.insert("goods.insert",goods);
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
    public void testUpdate(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",739);
            goods.setTitle("更新测试商品");
            int num=sqlSession.update("goods.update",goods);
            sqlSession.commit();
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
    public void testDelete(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            int num=sqlSession.delete("goods.delete",739);
            sqlSession.commit();
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
    public void testDynamicSQL(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Map map=new HashMap();
            map.put("categoryId",44);
            map.put("currentPrice",100);
            List<Goods> goods=sqlSession.selectList("goods.dynamicSQL",map);
            for (Goods g:goods) {
                System.out.println(g.getTitle()+" "+g.getCategoryId()+" "+g.getCurrentPrice());
            }
        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }

    @Test
    public void testLv1Cache(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",1603);
            Goods goods1=sqlSession.selectOne("goods.selectById",1603);
            System.out.println(goods.getTitle()+" "+goods1.getTitle());
            System.out.println(goods.hashCode()+" "+goods1.hashCode());

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",1603);
            Goods goods1=sqlSession.selectOne("goods.selectById",1603);
            System.out.println(goods.getTitle()+" "+goods1.getTitle());
            System.out.println(goods.hashCode()+" "+goods1.hashCode());

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }


    @Test
    public void testLv2Cache(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",1603);
            System.out.println(goods.hashCode());

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
        try {
            sqlSession=MyBatisUtils.openSession();
            Goods goods=sqlSession.selectOne("goods.selectById",1603);
            System.out.println(goods.hashCode());

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testOneToMany(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            List<Goods> list=sqlSession.selectList("goods.selectOneToMany");
            for (Goods goods:list){
                System.out.println(goods.getTitle()+" size:"+goods.getGoodsDetails().size());
                System.out.println(goods.getGoodsDetails());

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
            List<GoodsDetail> goodsDetails=sqlSession.selectList("goodsDetail.selectManyToOne");
            for(GoodsDetail goodsDetail:goodsDetails){
                System.out.println(goodsDetail.getGdId()+" "+goodsDetail.getGdPicUrl()+" "+goodsDetail.getGoods().getTitle());
            }

        }catch (Exception e){
            throw e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
    @Test
    public void testSelectPage(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MyBatisUtils.openSession();
            PageHelper.startPage(2,10);
            Page<Goods> page=(Page)sqlSession.selectList("goods.selectPage");
            System.out.println("总页数："+page.getPages());
            System.out.println("总记录数："+page.getTotal());
            System.out.println("开始行号："+page.getStartRow());
            System.out.println("结束行号："+page.getEndRow());
            System.out.println("当前页码："+page.getPageNum());
            List<Goods> data=page.getResult();//当前页数据
            for (Goods goods:data) {
                System.out.println(goods.getTitle());
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
        try {
            Long st=new Date().getTime();
            sqlSession=MyBatisUtils.openSession();
            List <Goods> list=new ArrayList<>();
            for (int i = 0; i <1000 ; i++) {
                Goods goods=new Goods();
                goods.setTitle("测试商品1");
                goods.setSubTitle("测试子标题1");
                goods.setOriginalCost(200f);
                goods.setCurrentPrice(100f);
                goods.setDiscount(0.5f);
                goods.setIsFreeDelivery(1);
                goods.setCategoryId(43);
                list.add(goods);
            }
            sqlSession.insert("goods.batchInsert",list);
            Long et=new Date().getTime();
            System.out.println("执行这段时间花了"+(et-st)+"毫秒");
        }catch (Exception e){
            throw  e;
        }finally {
            MyBatisUtils.closeSession(sqlSession);
        }
    }
}
