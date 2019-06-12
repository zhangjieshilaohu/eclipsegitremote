package com.liu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);
    FileOutputStream fos = new FileOutputStream("d:/b.txt", true);

    System.out.println("请输入内容");
    while (true) {
      String str = sc.next();
      if (str.equals("end")) {
        break;
      }
      str += "\r\n";
      byte[] b = str.getBytes();
      fos.write(b);
    }
    fos.close();
  }
}
