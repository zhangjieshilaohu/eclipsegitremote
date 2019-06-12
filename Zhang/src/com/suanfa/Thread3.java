package com.suanfa;

public class Thread3 {

  public static void main(String[] args) {
    Thread01 t1 = new Thread01();
    Thread t01 = new Thread(t1);
    t01.setName("老虎");
    t01.start();

  }
}

class Thread01 implements Runnable {

  @Override
  public void run() {
    // TODO Auto-generated method stub
    for (int i = 1; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + i + " ");
    }
  }

};
