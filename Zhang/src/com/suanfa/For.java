package com.suanfa;

public class For {

  public static void main(String[] args) {

    int[] a = { 1, 5, 3, 6 };
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
      System.out.println("++++");
      if (a[i] == 5) {
        break;
      }
    }
  }
}
