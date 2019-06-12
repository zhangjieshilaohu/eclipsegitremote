package com.atguigu.redis.code.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.redis.util.JedisUtil;

import redis.clients.jedis.Jedis;

public class VerifyCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		// 对验证码进行校验
		String phone = request.getParameter("phone_no");
		String code = request.getParameter("verify_code");
		// 获取提交的验证码
		Jedis jedis = JedisUtil.getJedis();
		// 进行校验
		String codeKey = "phone:"+phone+":code";
		String codeVal = jedis.get(codeKey);
		
		if ( code.equals(codeVal) ) {
			response.getWriter().append("true");
		} else {
			response.getWriter().append("false");
		}
		
				
		jedis.close();
	}

}
