package com.gof.design.patterns.creational.Prototype;

import com.gof.design.patterns.creational.Prototype.framework.Product;
import java.util.stream.IntStream;

public class UnderlinePen implements Product {

  private final char ulChar;

  public UnderlinePen(char ulChar) {
    this.ulChar = ulChar;
  }

  @Override
  public void use(String s) {
    System.out.println(s);
    decorate(s);
    System.out.println();
  }

  private void decorate(String s) {
    int uLen = s.length();
    IntStream.range(0, uLen).forEach(
        i -> System.out.print(ulChar)
    );
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
}
