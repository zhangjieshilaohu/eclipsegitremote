package com.Socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Test01 {
  public static void main(String[] args) throws UnknownHostException {

    InetAddress ia = InetAddress.getLocalHost();
    System.out.println("计算机名：" + ia.getHostName());
    System.out.println("IP地址为：" + ia.getHostAddress());
    byte[] bytes = ia.getAddress();//获取字节数组形式的ip地址
    System.out.println("字节数组形式ip:" + Arrays.toString(bytes));
    System.out.println(ia);
    System.out.println("++++++++++");
    //根据主机名获取InetAddress实例
    InetAddress bn = InetAddress.getByName("192.168.1.9");
    System.out.println("计算机名字为:" + bn.getHostName());
    System.out.println("IP地址为:" + bn.getHostAddress());
  }
}
