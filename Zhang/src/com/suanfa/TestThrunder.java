package com.suanfa;

public class TestThrunder {

  public static void main(String[] args) {

    MyThrunder t1 = new MyThrunder();
    t1.setName("老虎");
    MyThrunder t2 = new MyThrunder();
    t2.setName("狮子");
    MyThrunder t3 = new MyThrunder();
    t3.setName("龙");
    MyThrunder t4 = new MyThrunder();
    t4.setName("张杰");
    //启动线程
    t1.start();
    t2.start();
    t3.start();
    t4.start();
  }
}

class MyThrunder extends Thread {
  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println("正在下载电影" + Thread.currentThread().getName() + "已经下载" + i + "%");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      if (i == 100) {
        System.out.println("电影" + Thread.currentThread().getName() + "已经下载完毕");
      }
    }
  }
}
