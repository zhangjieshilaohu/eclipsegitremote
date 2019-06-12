package com.bawei;

import java.util.ArrayList;

public class ArrayListTest {

  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    //依次添加数据
    list.add("a");
    list.add("c");
    list.add("b");
    list.add("c");
    list.add("b");
    list.add("c");
    System.out.println("顺序添加" + list);
    //结果为【a,b,c】 结果为中括号 list有序 可重复  顺序为添加时的顺序

    //在第一个数据后面添加E
    list.add(1, "e");
    System.out.println("在第一个元素后面添加E" + list);
    //添加的位置为输入的序列号。  当arraylist没有数据时，就会出现indexoutofboundsexception异常
    //在第三个元素后面添加F
    list.add(3, "F");
    System.out.println("在第三个元素后面添加F" + list);

  }
}
