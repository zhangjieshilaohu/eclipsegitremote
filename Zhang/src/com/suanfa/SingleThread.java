package com.suanfa;

public class SingleThread {

  public static void main(String[] args) {
    System.out.println("main方法开始执行");
    a();
    System.out.println("main方法结束。。。");

  }

  public static void a() {
    System.out.println("a方法开始执行");
    b();
    System.out.println("a方法执行");
  }

  public static void b() {
    System.out.println("b方法开始执行");
    c();
    System.out.println("b方法结束");
  }

  public static void c() {
    System.out.println("c方法开始执行");
    System.out.println("hello  world");
    System.out.println("c方法结束");
  }
}
