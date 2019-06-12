/*package com.suanfa2;

class B {
  public int f(int i) {
    return i + i;
  }

  public int f(int i, int j) {
    return i + j;
  }

  public int f(char c) {
    return c;
  };
};

public class Text extends B {
  public int f(int i, int j) {
    return super.f(i, j);
  }

  public int f(int j) {
    return -1 * j;
  }

  public static void main(String[] args) {
    B x = new Text();
    System.out.println(x.f(5, 1) + " " + x.f(4) + " " + x.f('A'));
  }
}
*/