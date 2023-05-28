package com.gof.design.patterns.creational.Prototype.framework;

public interface Product {

  void use(String s);

  Product createCopy();
}
