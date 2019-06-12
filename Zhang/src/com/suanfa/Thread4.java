package com.suanfa;

public class Thread4 {

  public static void main(String[] args) {
    MyImplInterface m1 = new MyImplInterface();

    Thread t1 = new Thread(m1);
    t1.setName("老虎");
    t1.start();//就绪状态

    t1.interrupt();
  }

}

class MyImplInterface implements Runnable {

  @Override
  public void run() {
    // TODO Auto-generated method stub
    for (int i = 0; i < 5; i++) {
      System.out.println("我的任务:world 当前线程是" + Thread.currentThread().getName());
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        System.out.println("线程被打扰（阻塞接触）");
        break;
      }
    }
  }

};
