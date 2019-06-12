package com.suanfa;

public class Thread2 {

  public static void main(String[] args) {
    //写两个线程
    Shu1 s1 = new Shu1();
    s1.setName("老虎");
    s1.start();
    Shu2 s2 = new Shu2();
    s2.setName("狮子");

    s2.start();

  }
}

class Shu1 extends Thread {
  public void run() {
    for (int i = 1; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + i);
      if (i == 5) {
        try {
          Thread.sleep(5000);

        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        ;
      }
    }
  }
}

class Shu2 extends Thread {
  public void run() {
    for (int i = 10; i < 20; i++) {
      System.out.println(Thread.currentThread().getName() + i);
    }
  }
}
