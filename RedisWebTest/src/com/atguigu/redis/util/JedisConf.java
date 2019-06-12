package com.atguigu.redis.util;

import java.util.ResourceBundle;

public class JedisConf {

	private static ResourceBundle redis = ResourceBundle.getBundle("redis");
	
	public static String getVal( String key ) {
		if ( key == null || key.trim().equals("") ) {
			return "";
		}
		if ( redis.containsKey(key) ) {
			return redis.getString(key);
		} else {
			return "";
		}
	}
	
	public static int getIntVal( String key ) {
		if ( key == null || key.trim().equals("") ) {
			return 0;
		}
		if ( redis.containsKey(key) ) {
			return Integer.parseInt(redis.getString(key));
		} else {
			return 0;
		}
	}
}
