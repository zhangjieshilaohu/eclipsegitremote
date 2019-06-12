package com.io;

import java.io.File;

public class Test01 {

  public static void main(String[] args) {

    //写一个文件file对象
    File file01 = new File("a", "a/txt");
    //判断file01是否成立
    System.out.println(file01.exists());

    File file02 = new File("a/a.txt");
    System.out.println(file02.exists());

    File file03 = new File("a");
    File file04 = new File(file03, "/a.txt");
    System.out.println(file04.exists());
  }
}
