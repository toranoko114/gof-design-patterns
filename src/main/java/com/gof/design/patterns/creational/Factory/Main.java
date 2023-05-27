package com.gof.design.patterns.creational.Factory;

import com.gof.design.patterns.creational.Factory.idcard.IDCardFactory;

public class Main {

  public static void main(String[] args) {
    var factory = new IDCardFactory();
    var cardOfMike = factory.create("Mike");
    var cardOfShowy = factory.create("Showy");
    cardOfMike.use();
    cardOfShowy.use();
  }
}
