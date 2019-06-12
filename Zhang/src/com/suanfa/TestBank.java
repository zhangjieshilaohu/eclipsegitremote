package com.suanfa;

public class TestBank {

  public static void main(String[] args) {

    //写两个线程
    Cus c1 = new Cus();
    c1.setName("客户1");
    Cus c2 = new Cus();
    c2.setName("客户1");
    c1.start();
    c2.start();
  }
}

class Cus extends Thread {
  Bank b = new Bank();

  @Override
  public void run() {
    // TODO Auto-generated method stub
    for (int i = 0; i < 3; i++) {
      System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "存款");
      b.add(100);
    }
  }
};

class Bank {
  private int sum;

  Object obj = new Object();

  public void add(int n) {
    // TODO Auto-generated method stub
    synchronized (obj) {
      sum = sum + n;
      System.out.println("sum=" + sum);
    }
  }

};