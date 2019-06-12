package com.bawei;

import java.util.LinkedList;

public class LinkedList09 {

  public static void main(String[] args) {
    LinkedList<String> thelist = new LinkedList<String>();
    thelist.add("A");
    thelist.add("B");
    thelist.add("C");
    thelist.add("D");
    /*String[] my = thelist.toArray(new String[0]);
    for (int i = 0; i < my.length; i++) {
      System.out.println(my[i]);
    }*/
    String[] my = thelist.toArray(new String[thelist.size()]);
    for (int i = 0; i < my.length; i++) {
      System.out.println(my[i]);
    }
  }
}
