package com.bw.entity;

public class Bananar {

  private String name;

  private double price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Bananar(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }

  public Bananar() {
    super();
  }

  @Override
  public String toString() {
    return "Bananar [name=" + name + ", price=" + price + "]";
  }

}
