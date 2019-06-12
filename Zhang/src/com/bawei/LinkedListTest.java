package com.bawei;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

  public static void main(String[] args) {
    //获取链表的第一个和最后一个元素
    LinkedList<String> llist = new LinkedList<String>();
    llist.add("1");
    llist.add("2");
    llist.add("3");
    llist.add("4");
    llist.add("5");
    System.out.println("链表的第一个元素是:" + llist.getFirst());
    System.out.println("链表的最后一个元素是:" + llist.getLast());
    //获取链表元素
    for (String str : llist) {
      System.out.print(str + "  ");
    }
    //从链表生成子表
    List<String> sub1 = llist.subList(1, 4);
    System.out.println(sub1);
    sub1.remove(2);
    System.out.println(sub1);
    System.out.println(llist);
  }
}
