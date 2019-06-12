package com.bawei;

import java.util.LinkedList;

public class LinkedList04 {
  //使用链表实现栈效果
  public static void main(String[] args) {

    StackL stack = new StackL();
    for (int i = 0; i < 10; i++) {
      stack.push(i);
    }
    System.out.println(stack.top());
    System.out.println(stack.top());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}

class StackL {
  public LinkedList list = new LinkedList();

  public void push(Object v) {
    list.addFirst(v);
  }

  public Object top() {
    return list.getFirst();
  }

  public Object pop() {
    return list.removeFirst();
  }
}
