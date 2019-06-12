package com.suanfa;

import java.util.HashMap;
import java.util.Iterator;

public class Thread8 {

  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("a", "aaa");
    map.put("b", "bbb");
    map.put("c", "ccc");
    map.put("d", "dddd");
    Iterator iterator = map.keySet().iterator();
    while (iterator.hasNext()) {
      Object key = iterator.next();
      System.out.println("map.get(key) is" + map.get(key));
    }

  }
}
