package com.io;

import java.io.File;
import java.io.IOException;

public class Test02 {

  public static void main(String[] args) throws IOException {
    //创建一个类的对象 创建到windows中d盘中
    File file = new File("D:/b.txt");
    if (file.exists() == true) {
      System.out.println("文件已存在");
    } else {
      System.out.println(file.createNewFile());
    }

    if (file.exists() == true) {
      System.out.println(file.getPath());
    } else {
      System.out.println("文件不存在");
    }

    //创建文件夹(windows系统中)
    File file01 = new File("b");
    file01.mkdir();
    if (file01.exists() == true) {
      System.out.println("文件已经存在");
    }
  }
}
