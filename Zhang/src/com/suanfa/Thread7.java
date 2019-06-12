package com.suanfa;

public class Thread7 {

  public static void main(String[] args) {
    Ticket02 t02 = new Ticket02();
    Thread t1 = new Thread(t02);
    t1.setName("老虎");
    Thread t2 = new Thread(t02);
    t2.setName("狮子");
    Thread t3 = new Thread(t02);
    t3.setName("龙");
    Thread t4 = new Thread(t02);
    t4.setName("老鼠");
    Thread t5 = new Thread(t02);
    t5.setName("牛牛");
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
  }
}

class Ticket02 implements Runnable {

  public int num = 100;

  Object obj = new Object();

  @Override
  public void run() {
    // TODO Auto-generated method stub
    synchronized (obj) {
      while (true) {
        if (num > 0) {

          try {
            Thread.sleep(200);
          } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }

          System.out.println(Thread.currentThread().getName() + "sales " + (num--));
        }

      }
    }
  }

};
