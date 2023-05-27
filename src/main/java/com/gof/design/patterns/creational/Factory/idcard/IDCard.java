package com.gof.design.patterns.creational.Factory.idcard;

import com.gof.design.patterns.creational.Factory.framework.Product;

public class IDCard implements Product {

  private final String owner;

  IDCard(String owner) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  @Override
  public void use() {
    System.out.println(this + "を使います。");
  }

  @Override
  public String toString() {
    return "[IDCard:" + owner + "]";
  }

}
