package com.bawei;

import java.util.ArrayList;

public class ArraysListTest3 {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    System.out.println("删除前:" + list);
    //删除第二个元素，数组的下标是从0开始计算的
    list.remove("d");
    System.out.println("删除后的" + list);
    /*    list.remove(2);
    System.out.println("删除后的" + list);
    */
  }
}
