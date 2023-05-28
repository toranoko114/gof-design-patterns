package com.gof.design.patterns.creational.Prototype;

import com.gof.design.patterns.creational.Prototype.framework.Product;
import java.util.stream.IntStream;

public class MessageBox implements Product {

  private final char decoChar;

  public MessageBox(char decoChar) {
    this.decoChar = decoChar;
  }

  @Override
  public void use(String s) {
    decorate(s);
    System.out.println();
    System.out.println(decoChar + s + decoChar);
    decorate(s);
    System.out.println();
  }

  private void decorate(String s) {
    int decoLen = 1 + s.length() + 1;
    IntStream.range(0, decoLen).forEach(
        i -> System.out.print(decoChar)
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
