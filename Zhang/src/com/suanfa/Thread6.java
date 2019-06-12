package com.suanfa;

public class Thread6 {

  public static void main(String[] args) {
    Ticket01 t1 = new Ticket01();
    t1.setName("第一个窗口");
    Ticket01 t2 = new Ticket01();
    t1.setName("第二个窗口");
    Ticket01 t3 = new Ticket01();
    t1.setName("第三个窗口");
    Ticket01 t4 = new Ticket01();
    t1.setName("第四个窗口");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}

class Ticket01 extends Thread {
  public static int num = 100;

  public void run() {
    while (true) {
      if (num > 0) {
        System.out.println(Thread.currentThread().getName() + "sales" + (num--));
      }
    }
  }
};
