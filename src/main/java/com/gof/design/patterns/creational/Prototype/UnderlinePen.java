package com.gof.design.patterns.creational.Prototype;

import com.gof.design.patterns.creational.Prototype.framework.ConcreteProduct;

public class UnderlinePen extends ConcreteProduct {

  private final char ulChar;

  public UnderlinePen(char ulChar) {
    this.ulChar = ulChar;
  }

  @Override
  public void use(String s) {
    System.out.println(s);
    super.decorate(ulChar, s.length());
    System.out.println();
  }
}
