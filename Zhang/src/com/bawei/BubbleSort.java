package com.bawei;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] a = { 1, 5, 3, 8, 9, 4, 5, 2, 66 };
    int temp;
    int flag = 0;
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1 - i; j++) {

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
    } //趟数
    System.out.println("结果为:");
    for (Integer shu : a) {
      System.out.print(shu + " ");
    }
    System.out.println(Arrays.toString(a));

  }
}
