package com.suanfa;

public class Thread1 {
  public static void main(String[] args) {
    // Thread.currentThread().setName("张杰");
    MyThread m1 = new MyThread();
    m1.setName("张杰");
    m1.start();
    MyThread2 m2 = new MyThread2();
    m2.setName("老虎");
    m2.start();
  }

}

class MyThread extends Thread {
  //重写run方法
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + i);
    }
  }
}

class MyThread2 extends Thread {
  public void run() {
    for (int i = 0; i < 20; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i);
    }
  }
}
