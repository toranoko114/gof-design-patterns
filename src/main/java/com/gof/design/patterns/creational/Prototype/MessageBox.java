package com.gof.design.patterns.creational.Prototype;

import com.gof.design.patterns.creational.Prototype.framework.ConcreteProduct;

public class MessageBox extends ConcreteProduct {

  private final char decoChar;

  public MessageBox(char decoChar) {
    this.decoChar = decoChar;
  }

  @Override
  public void use(String s) {
    int decoLen = 1 + s.length() + 1;
    super.decorate(decoChar, decoLen);
    System.out.println();
    System.out.println(decoChar + s + decoChar);
    super.decorate(decoChar, decoLen);
    System.out.println();
  }
}
