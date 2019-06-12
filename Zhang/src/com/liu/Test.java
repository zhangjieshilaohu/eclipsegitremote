package com.liu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {

  public static void main(String[] args) throws FileNotFoundException {

    //fileinputstream  字节输入流
    File file = new File("D:/a.txt");
    FileInputStream fis = new FileInputStream(file);
    //FileInputStream fis01 = new FileInputStream("d:/a.txt");
    if (file.exists() == true) {
      System.out.println("文件存在");
    }
  }
}
