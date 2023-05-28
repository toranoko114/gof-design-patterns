package com.gof.design.patterns.creational.Prototype.framework;

import java.util.stream.IntStream;

public class ConcreteProduct implements Product {

  @Override
  public void use(String s) {
  }

  @Override
  public Product createCopy() {
    Product p = null;
    try {
      p = (Product) this.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return p;
  }

  public void decorate(char ch, int length) {
    IntStream.range(0, length).forEach(
        i -> System.out.print(ch)
    );
  }

}
