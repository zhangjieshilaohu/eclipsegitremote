package com.bawei;

import java.util.LinkedList;

public class LinkedList07 {

  public static void main(String[] args) {
    LinkedList<String> llist = new LinkedList<String>();
    llist.add("1");
    llist.add("2");
    llist.add("3");
    llist.add("4");
    llist.add("5");
    System.out.println(llist);
    //元素在删除的时候，仍然可以获取元素
    String object = llist.removeFirst();
    System.out.println(object + "has been removed");
    System.out.println(llist);
    object = llist.removeLast();
    System.out.println("object+" + object);
    System.out.println(llist);
  }
}
