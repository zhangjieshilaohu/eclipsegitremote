package com.suanfa2;

class A {
  int a = 1;
}

public class Test2 {

  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();
    A obj3 = obj1;
    String s1 = new String("abc");
    String s2 = new String("abc");
    String s3 = "abc";
    System.out.println(obj1 == obj2);//new对象  内存地址不同

    //new对象   继承object中的equals和hashcode方法，比较内存地址
    System.out.println(obj1.equals(obj2));

    System.out.println(obj1 == obj3); // obj1给obj2  数据的值一样
    System.out.println(s1 == s2);//String类比较内存地址
    System.out.println(s1.equals(s2));//String类比较文本内容
    System.out.println(s1.equals(s3));//String类比较文本内容

  }
}
