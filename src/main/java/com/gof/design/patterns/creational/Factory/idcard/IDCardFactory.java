package com.gof.design.patterns.creational.Factory.idcard;

import com.gof.design.patterns.creational.Factory.framework.Factory;
import com.gof.design.patterns.creational.Factory.framework.Product;

public class IDCardFactory implements Factory {

  @Override
  public Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  public void registerProduct(Product product) {
    System.out.println(product + "を登録しました。");
  }

}
