package com.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test4 {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    //创建一个服务器
    try {
      ServerSocket ss = new ServerSocket(8888);
      System.out.println("***服务器即将启动，等待客户端的连接****");
      Socket accept = ss.accept();
      InputStream is = accept.getInputStream();
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      String info = null;
      while ((info = br.readLine()) != null) {
        System.out.println("我是服务器，客户端说:" + info);
      }
      accept.shutdownInput();
      br.close();
      isr.close();
      is.close();
      ss.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
