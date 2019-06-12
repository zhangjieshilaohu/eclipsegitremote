package com.suanfa;

import java.util.Arrays;

public class BubbleSort {
  //冒泡排序O(n ^ 2) n的平方
  public static void main(String[] args) {
    int[] a = { 1, 0, -1, 55, 32, 45, -3, -1 };
    int temp;
    int flag = 0;
    for (int i = 0; i < a.length - 1; i++) {
      flag = 0;
      //第一次优化  减少对比次数
      for (int j = 0; j < a.length - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          flag = 1;
          temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
        }

      }
      //第二个for外面  最终版优化  减少对比次数和交换次数
      //如果外面没有执行，则直接退出循环
      if (flag == 0) {
        break;
      }
    }
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
    for (int num : a) {
      System.out.print(num + " ");
    }
    System.out.println();
    //数组输出
    System.out.println(Arrays.toString(a));

  }
}
