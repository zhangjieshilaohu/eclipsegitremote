package com.bawei;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest10 {

  public static void main(String[] args) {
    LinkedList stack = new LinkedList();
    Object object = "";
    stack.addFirst(object);
    Object o = stack.getFirst();
    stack = (LinkedList) Collections.synchronizedList(stack);
  }
}
