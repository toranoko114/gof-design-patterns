package com.gof.design.patterns.creational.Factory.framework;

public interface Factory {

  Product createProduct(String owner);

  void registerProduct(Product product);

  default Product create(String owner) {
    /*
      抽象メソッドではなくデフォルト実装にする場合、
      Productクラスを直接newすることになるため、
      Productクラスをインスタンス化できない抽象クラスにすることはできない。
     */
    Product product = createProduct(owner);
    registerProduct(product);
    return product;
  }

}
