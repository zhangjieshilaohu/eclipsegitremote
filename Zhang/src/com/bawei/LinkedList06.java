package com.bawei;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList06 {
  //把linkedlist转换成arraylist
  public static void main(String[] args) {
    LinkedList<String> llist = new LinkedList<String>();
    llist.add("A");
    llist.add("B");
    llist.add("C");
    ArrayList<String> list2 = new ArrayList<String>(llist);
    for (String str : list2) {
      System.out.println("str=" + str);
    }
  }
}
