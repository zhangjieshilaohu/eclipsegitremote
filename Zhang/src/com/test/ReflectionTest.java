package com.test;

import com.bw.entity.Student;

public class ReflectionTest {

  public static void main(String[] args) throws ClassNotFoundException {
    //反射是指 程序可以检测 和修改 他本身的一种状态和能力。
    //反射是指程序可以访问 检测和修改它本身状态或行为的一种能力

    Class<?> s1 = Class.forName("com.bw.entity.Student");
    Class<?> s2 = new Student().getClass();
    Class<?> s3 = Student.class;
  }
}
