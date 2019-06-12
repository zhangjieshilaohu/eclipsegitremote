package com.bawei;

import java.util.LinkedList;

public class LinkedListTest08 {

  public static void main(String[] args) {

    LinkedList<String> llist = new LinkedList<String>();
    llist.add("1");
    llist.add("2");
    llist.add("3");
    llist.add("4");
    llist.add("5");
    System.out.println(llist);
    /*llist.subList(2, 3).clear();
    System.out.println(llist);*/
    System.out.println(llist.remove("2"));//删除元素值为2
    System.out.println(llist);
    String obj = llist.remove(2);//删除第二个元素
    System.out.println(obj + "已经从链表中删除");
    System.out.println(llist);
  }
}
