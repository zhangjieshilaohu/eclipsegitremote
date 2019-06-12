package com.ceshi;

import java.util.Arrays;

public class Test02 {

  public static void main() {

    int[] a = { 1, 6, 8, 2, 4, 3, 7, 9, 2, 2, 66, 12 };

    int temp;
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
      }
    } //for结束
    System.out.println(Arrays.toString(a));
    System.out.println("hello world");
  }
}
