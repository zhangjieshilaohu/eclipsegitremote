package com.atguigu.redis.util;

import redis.clients.jedis.Jedis;

public class JedisUtil {

  public static void main(String[] args) {
    /*
    测试Redis服务器的连接
    如果出现连接失败 ： java.net.SocketTimeoutException: connect timed out
    可能的原因是 
    1）Redis服务器，端口号不正确
    2）Redis服务器未启动
    3）远程服务器未放开端口访问 6379
    */
    Jedis jedis = getJedis();
    //System.out.println( jedis.ping() );

    /*
     * 
     
     读取Key
     */
    //jedis.flushDB();

    /*Set<String> keySet = jedis.keys("*");
    for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
      String key = iterator.next();
      System.out.println(key);
    }
    System.out.println("key 是否存在====>" + jedis.exists("k2"));
    System.out.println(jedis.ttl("k1"));
    */
    /*
     * 操作String数据
     * 
     * */
    //jedis.flushDB();
    System.out.println(jedis.get("k11"));
    String result = jedis.set("k4", "k4_Redis");
    System.out.println(result);
    System.out.println("----------------------------------------");
    jedis.mset("str1", "v1", "str2", "v2", "str3", "v3");
    System.out.println(jedis.mget("str1", "str2", "str3"));

    /*
     * 操作List数据
    
    jedis.flushDB();
    jedis.lpush("k1", "v1", "v2", "v3", "v4", "v5");
    String v1 = jedis.lpop("k1");
    System.out.println( v1 );
    System.out.println("-----------------------");
    List<String> vals = jedis.lrange("k1", 0, -1);
    for ( String val : vals ) {
    	System.out.println( val );
    }
    */

    /*
     * 操作Set数据
     * 
    jedis.flushDB();
    jedis.sadd("orders","jd001");
    jedis.sadd("orders","jd002");
    jedis.sadd("orders","jd003");
    Set<String> set1 = jedis.smembers("orders");
    for (Iterator<String> iterator = set1.iterator(); iterator.hasNext();) {
      String string = iterator.next();
      System.out.println(string);
    }
    long result = jedis.srem("orders","jd002");
    System.out.println( "result = " + result );
    */

    /*
     * 操作Hash数据
     * 
    jedis.flushDB();
    jedis.hset("hash1","userName","lisi");
    System.out.println(jedis.hget("hash1","userName"));
    Map<String, String> map = new HashMap<String, String>();
    map.put("telphone","13810169999");
    map.put("address","atguigu");
    map.put("email","abc@163.com");
    jedis.hmset("hash2",map);
    List<String> result = jedis.hmget("hash2", "telphone","email");
    for (String element : result) {
      System.out.println(element);
    }
    */

    /*
     * 操作zSet数据
     
    jedis.flushDB();
    jedis.zadd("zset01",60d,"v1");
    jedis.zadd("zset01",70d,"v2");
    jedis.zadd("zset01",80d,"v3");
    jedis.zadd("zset01",90d,"v4");
    Set<String> s1 = jedis.zrange("zset01",0,-1);
    for (Iterator<String> iterator = s1.iterator(); iterator.hasNext();) {
      String string = iterator.next();
      System.out.println(string);
    }
    */
    jedis.close();
  }

  public static Jedis getJedis() {
    // 192.168.183.136s
    Jedis jedis = new Jedis(JedisConf.getVal("REDIS.SERVER.URL"), JedisConf.getIntVal("REDIS.SERVER.PORT"));
    return jedis;
  }

}
