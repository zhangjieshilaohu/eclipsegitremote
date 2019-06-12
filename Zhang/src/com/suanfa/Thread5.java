package com.suanfa;

public class Thread5 {

  public static void main(String[] args) {
    //main方法是主线程
    String t = Thread.currentThread().getName();

    System.out.println(t);
  }
}
