package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("D:/神偷奶爸3.mp4");
    BufferedInputStream bis = new BufferedInputStream(fis);
    FileOutputStream fos = new FileOutputStream("D:/2.mp4");
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    byte[] b = new byte[1024];
    int len = bis.read(b);
    while (len != -1) {
      bos.write(b);
      len = bis.read(b);
    }
    bos.close();
    bis.close();
  }
}
