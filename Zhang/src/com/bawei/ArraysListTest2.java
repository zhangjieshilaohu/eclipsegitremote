package com.bawei;

import java.util.ArrayList;

public class ArraysListTest2 {

  public static void main(String[] args) {
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    System.out.println(list1);
    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("d");
    list2.add("e");
    list2.add("f");
    System.out.println(list2);
    //将list2全部添加到list1中
    /*list1.addAll(list2);
    System.out.println("将list2全部添加到list1中" + list1);*/
    //将list全部添加到list1中的b之后
    list1.addAll(2, list2);
    list1.clear();
    System.out.println(list1);
  }
}
