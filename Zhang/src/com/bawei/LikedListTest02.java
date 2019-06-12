package com.bawei;

import java.util.LinkedList;

public class LikedListTest02 {

  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("X");
    list.add("Z");
    System.out.println(list);
    //删除元素
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
  }
}
