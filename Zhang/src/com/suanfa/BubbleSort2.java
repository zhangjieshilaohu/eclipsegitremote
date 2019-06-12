package com.suanfa;

import java.util.Arrays;

public class BubbleSort2 {

  public static void main(String[] args) {

    int[] a = { -1, 2, 6, 33, 12, 7 };
    int temp;
    int flag = 0;
    for (int i = 0; i < a.length - 1; i++) {
      flag = 0;
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          flag = 1;
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }
      } //次数
      if (flag == 0) {
        break;
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    System.out.print(Arrays.toString(a));
  }
}
