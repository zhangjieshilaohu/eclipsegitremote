package com.Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URL2 {

  public static void main(String[] args) {

    //创建一个url实例
    try {
      URL url = new URL("https://www.taobao.com");
      //通过url的openstream方法获取url对象所表示的资源的字节输入流
      InputStream os = url.openStream();
      //将字节输入流转换为字符输入流
      InputStreamReader isr = new InputStreamReader(os);
      //为字符输入流添加缓冲
      BufferedReader br = new BufferedReader(isr);
      String data = br.readLine();
      while (data != null) {
        System.out.println(data);
        data = br.readLine();
      }
      //释放资源
      br.close();
      isr.close();
      os.close();
    } catch (MalformedURLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
