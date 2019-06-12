package com.liu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test3 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("d:/b.txt");
    FileOutputStream fos = new FileOutputStream(file);

    if (file.exists() == true) {
      System.out.println("文件存在");
    }
  }
}
