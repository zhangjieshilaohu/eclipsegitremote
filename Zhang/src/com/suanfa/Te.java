package com.suanfa;

public class Te {
  public static void main(String[] args) {
    B obj = new B();
  }
}

class A {
  static {
    System.out.println("X");
  }

  public A() {
    System.out.println("A");
  }
}

class B extends A {
  static {
    System.out.println("Y");
  }

  public B() {
    System.out.println("B");
  }
}