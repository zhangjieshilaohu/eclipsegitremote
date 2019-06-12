package com.suanfa;

import java.util.Arrays;

public class BubbleSort02 {

  public static void main(String[] args) {

    //创建新的数组
    int[] arr = { 1, 3, 2, 4, 8, 9, 5, 7, 6, 1, 3 };
    int temp;
    int flag = 0;
    for (int i = 0; i < arr.length - 1; i++) { //两个进行交换 少1  下标从0开始 少1
      flag = 0;
      for (int j = 0; j < arr.length - 1 - i; j++) {

        if (arr[j] < arr[j + 1]) {
          flag = 1;
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      } //次数
      if (flag == 0) {
        break;
      }

    } //趟数
    System.out.println("从小到大的顺序为:");
    System.out.println(Arrays.toString(arr));
  }
}
