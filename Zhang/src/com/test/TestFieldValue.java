package com.test;

import java.lang.reflect.Field;

public class TestFieldValue {

  public static void main(String[] args)
    throws ClassNotFoundException, InstantiationException, IllegalAccessException {

    Class<?> forName = Class.forName("com.bw.entity.Bananar");
    Object newInstance = forName.newInstance();
    //第一种 直接给属性赋值
    Field[] declaredFields = forName.getDeclaredFields();
    for (Field field : declaredFields) {
      field.setAccessible(true);

      if (field.getName().equals("name") && field.getType().getSimpleName().equals("String")) {
        field.set(newInstance, "香蕉");

      }
      if (field.getName().equals("price") && field.getType().getSimpleName().equals("double")) {
        field.set(newInstance, 15);
      }

    }
    for (Field field : declaredFields) {
      Object object = field.get(newInstance);
      System.out.println(field.getName() + object);
    }
  }
}
