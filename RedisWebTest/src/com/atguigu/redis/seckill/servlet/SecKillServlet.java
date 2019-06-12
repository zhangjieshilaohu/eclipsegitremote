package com.atguigu.redis.seckill.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atguigu.redis.seckill.logic.SecKill4Redis;
import com.atguigu.redis.seckill.logic.SecKill4RedisByLua;

public class SecKillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = new Random().nextInt(50000) +"" ; 
		String prodid =request.getParameter("prodid");
		boolean success = SecKill4RedisByLua.doSecKill(userid,prodid);
		response.getWriter().print(success);
	}

}
