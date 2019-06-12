package com.ceshi;

public class Test {
  Person person = new Person("Test");
  static {
    System.out.println("test static");
  }

  public Test() {
    System.out.println("test constructor");
  }

  public static void main(String[] args) {
    new MyClass();
    System.out.println("我一定会回来的");
  }
}

class Person {
  static {
    System.out.println("person static");
  }

  public Person(String str) {
    System.out.println("person " + str);
  }
}

class MyClass extends Test {
  Person person = new Person("MyClass");
  static {
    System.out.println("myclass static");
  }

  public MyClass() {
    System.out.println("myclass constructor");
  }
}