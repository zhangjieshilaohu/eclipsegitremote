package com.bawei;

import java.util.ArrayList;

public class ArrayListTest03 {

  public static void main(String[] args) {

    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    list1.add("d");
    list1.add("e");
    System.out.println("未删掉" + list1);
    //清空list
    list1.clear();
    System.out.println("删除之后" + list1);

    /*ArrayList<String> list2 = new ArrayList<String>();
    list2.add("a");
    list2.add("b");
    //按照list2的数据删掉list1中的数据
    list1.removeAll(list2);
    System.out.println(list1);
    */
  }
}
