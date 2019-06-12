package com.liu;

import java.util.HashMap;
import java.util.Map;

public class Person {

  String name;

  int age = 0;

  String sex;

  public int hashcode() {
    return this.age;
  }

  public boolean equals(Object obj) {
    Person person = (Person) obj;
    return this.name.equals(person.name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Person(String name, int age, String sex) {
    super();
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public static void main(String[] args) {
    Map map = new HashMap<>();
    Person p1 = new Person("王衡定", 20, "男");
    Person p2 = new Person("刘艳", 20, "女");
    Person p3 = new Person("陈实样", 25, "男");
    Person p4 = new Person("刘艳", 20, "男");
    /*   map.put(p1, "教师");
    map.put(p2, "特级教师");
    map.put(p3, "教师");
    map.put(p4, "高级教师");*/
    System.out.println(map.size());
    System.out.println(p2 == p4);
    System.out.println(p2.equals(p4));
    System.out.println(map.get(p2));
    new String();
  }
}
