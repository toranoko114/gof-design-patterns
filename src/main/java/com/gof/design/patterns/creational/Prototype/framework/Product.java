package com.gof.design.patterns.creational.Prototype.framework;

public interface Product extends Cloneable {

  void use(String s);

  Product createCopy();
}
