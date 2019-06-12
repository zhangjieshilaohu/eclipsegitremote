package com.atguigu.redis.seckill.logic;

import java.io.IOException;
import java.util.List;

import com.atguigu.redis.util.JedisPoolUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;



public class SecKill4Redis {
	
	/**
	 * 执行秒杀
	 * @param uid
	 * @param prodid
	 * @return
	 * @throws IOException
	 */
	public static boolean doSecKill( String uid, String prodid ) throws IOException {
		
		// 从连接池中获取Jedis对象
		JedisPool pool = JedisPoolUtil.getJedisPoolInstance();
		Jedis jedis = pool.getResource();
		
		String qtKey = "sk:"+prodid+":qt";
		String usersKey = "sk:"+prodid+":users"; // set
		
		// 判断当前用户是否已经秒杀成功
		boolean flg = jedis.sismember(usersKey, uid);
		if ( flg ) {
			System.err.println(uid + "==> 已经秒杀成功，不能再次秒杀。");
			jedis.close();
			return false;
		}
		
		// 使用乐观锁解决超卖问题
		jedis.watch(qtKey);
		// 库存为0 ，秒杀失败
		String qtVal = jedis.get(qtKey);
		int qt = Integer.parseInt(qtVal);
		if ( qt <= 0 ) {
			System.err.println(uid + "==> 库存不足，秒杀失败");
			jedis.close();
			return false;
		}
		
		Transaction tx = jedis.multi();
		// 秒杀成功，库存 -1
		tx.decr(qtKey);
		
		// 秒杀成功，增加用户
		tx.sadd(usersKey, uid);
		
		List<Object> results = tx.exec();
		if ( results == null || results.size() == 0 ) {
			System.out.println(uid + "==> 秒杀失败");
			doSecKill(uid, prodid);
		} else {
			System.out.println(uid + "==> 秒杀成功");
		}
		jedis.close();
		return true;
	}
	

}
