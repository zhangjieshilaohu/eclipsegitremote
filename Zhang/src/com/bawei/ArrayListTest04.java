package com.bawei;

import java.util.ArrayList;

public class ArrayListTest04 {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    System.out.println("修改qian:" + list);
    //index从0开始
    list.set(2, "q");
    System.out.println("修改后" + list);

    //获取第二个元素 index从0开始
    String a = list.get(2);
    System.out.println(a);

  }
}
