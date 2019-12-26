package com.imooc.jedis;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CacheSample {
    public CacheSample() {
        //new Jedis时没写ip连本地
        Jedis jedis = new Jedis();
        try {
            List<Goods> goodsList = new ArrayList<>();
            goodsList.add(new Goods(8818, "红富士苹果", "很甜的哦"));
            goodsList.add(new Goods(8819, "进口脐橙", "好吃的"));
            goodsList.add(new Goods(8820, "进口香蕉", "超级甜的哦"));
            jedis.auth("Redis@123");
            jedis.select(3);
            for (Goods goods : goodsList) {
                //序列化，存到redis里
                String json = JSON.toJSONString(goods);
                System.out.println(json);
                String key="goods:"+goods.getGoodsId();
                jedis.set(key,json);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jedis.close();
        }

    }
    public static void main(String[] args) {
        new CacheSample();
        System.out.println("请输入用户要查询商品编号：");
        String goodsId=new Scanner(System.in).next();
        Jedis jedis=new Jedis();
        try{
            jedis.auth("Redis@123");
            jedis.select(3);
            String key="goods:"+goodsId;
            if(jedis.exists(key)){
                String json=jedis.get(key);
                System.out.println(json);
                //转回对象，反序列化
                Goods g=JSON.parseObject(json,Goods.class);
                System.out.println(g.getGoodsName());
            }else{
                System.out.println("您输入的商品编号不存在");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }

    }
}
