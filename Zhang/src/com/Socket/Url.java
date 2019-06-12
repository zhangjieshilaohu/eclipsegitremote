package com.Socket;

import java.net.MalformedURLException;
import java.net.URL;

public class Url {

  public static void main(String[] args) {

    //创建一个url实例
    try {
      URL tb = new URL("https://wwwtaobao.com/");
      //？后面标示的参数，#后面表示额是锚点
      URL url = new URL(tb, "markets/nanzhuang/2017new?spm=a21bo.2017.201867-main.2.5af911d9OjpnOv");

      System.out.println("协议：" + url.getProtocol());
      System.out.println("主机：" + url.getHost());
      //如果未指定端口号，则使用默认的端口号，此时getpost（）方法返回值为-1
      System.out.println("端口：" + url.getPort());
      System.out.println("文件路径：" + url.getPath());
      System.out.println("文件名：" + url.getFile());
      System.out.println("相对路径：" + url.getRef());
      System.out.println("查询字符串：" + url.getQuery());
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
