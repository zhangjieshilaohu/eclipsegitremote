package com.liu;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {

  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("D:/a.txt");
    int read = fis.read();
    while (read != -1) {
      char c = (char) read;
      System.out.print(c);
      read = fis.read();
    }
    fis.close();
  }
}
