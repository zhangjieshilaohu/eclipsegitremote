package com.suanfa;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Thread9 {
  //实现callable接口
  public static void main(String[] args) {
    //执行callable方式，需要futuretask实现实现，用于接收运算结果
    FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
    new Thread(futureTask).start();
    //接受线程运算后的结果
    try {
      Integer sum = futureTask.get();
      System.out.println(sum);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ExecutionException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

class MyCallable implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    int sum = 0;
    for (int i = 1; i < 100; i++) {
      sum += i;
    }
    return sum;
  }

};
