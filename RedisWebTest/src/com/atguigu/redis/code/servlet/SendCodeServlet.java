package com.atguigu.redis.code.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.redis.util.JedisUtil;

import redis.clients.jedis.Jedis;


public class SendCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 从表单中获取电话号码
		String phone = request.getParameter("phone_no");
		
		// redis : key ==> phone:11111:count  value ==> 3 expire ==> 60*60*24
		// 获取当前电话号码输入的次数
		Jedis jedis = JedisUtil.getJedis();
		String countKey = "phone:"+phone+":count";
		String countVal = jedis.get(countKey);
		if ( countVal == null ) {
			// 第一次访问
			// 保存数量
			jedis.setex(countKey, 60*60*24, "1");
		} else {
			int count = Integer.parseInt(countVal);
			if ( count >= 3 ) {
				response.getWriter().append("limit");
				return;
			} else {
				jedis.incr(countKey);
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for ( int i = 1; i <= 6; i++ ) {
			builder.append(new Random().nextInt(10));
		}
		System.out.println("发送的验证码为 = " + builder);
		// 保存验证码
		String codeKey = "phone:"+phone+":code";
		jedis.setex(codeKey, 120, builder.toString());
		response.getWriter().append("true");
		
		jedis.close();
	}
}
