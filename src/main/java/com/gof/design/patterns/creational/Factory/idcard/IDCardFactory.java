package com.gof.design.patterns.creational.Factory.idcard;

import com.gof.design.patterns.creational.Factory.framework.Factory;
import com.gof.design.patterns.creational.Factory.framework.Product;
import java.util.HashMap;
import java.util.Map;

public class IDCardFactory implements Factory {

  private final Map<Integer, String> idCardMap = new HashMap<>();

  /*
    synchronizedを付与するのはマルチスレッドで動作させたときに同じserialが付かないようにするため.
   */
  @Override
  public synchronized Product createProduct(String owner) {
    var serial = idCardMap.size() + 1;
    idCardMap.put(serial, owner);
    return new IDCard(serial, owner);
  }

  @Override
  public void registerProduct(Product product) {
    System.out.println(product + "を登録しました。");
  }

}