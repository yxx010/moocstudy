package com.imooc.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JedisTestor {
    @Test
    public void JedisDemo(){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        try{
            jedis.auth("Redis@123");
            jedis.select(2);
            System.out.println("redis连接成功");
            jedis.set("sn","test1");
            String sn=jedis.get("sn");
            System.out.println("sn="+sn);
            jedis.mset(new String[]{"title","婴幼儿奶粉","num","20"});
            List<String> goods=jedis.mget(new String[]{"sn","title","num"});
            System.out.println(goods);
            Long num=jedis.incr("num");
            System.out.println("自增后num值为："+num);
            //hash
            jedis.hset("student:001","name","李兰");
            System.out.println(jedis.hget("student:001","name"));
            Map<String,String> studentMap=new HashMap<>();
            studentMap.put("name","小明");
            studentMap.put("age","12");
            studentMap.put("id","3312");
            jedis.hmset("student:3313",studentMap);
            Map <String,String> smp=jedis.hgetAll("student:3313");
            System.out.println("显示hgetall的值"+smp);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            jedis.close();

        }

    }
}
