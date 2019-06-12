package com.liu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {

  public static void main(String[] args) throws IOException {

    method01();
  }

  private static void method01() throws IOException {
    // TODO Auto-generated method stub
    FileInputStream fis = new FileInputStream("d:/c.txt");
    FileOutputStream fos = new FileOutputStream("D:/e.txt");
    byte[] b = new byte[1024];
    int len = fis.read(b);
    while (len != -1) {
      fos.write(b);
      len = fis.read(b);
    }
    fos.close();
    fis.close();
  }

}
