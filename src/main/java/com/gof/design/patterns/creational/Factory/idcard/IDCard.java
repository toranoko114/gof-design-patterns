package com.gof.design.patterns.creational.Factory.idcard;

import com.gof.design.patterns.creational.Factory.framework.Product;

public class IDCard implements Product {

  private final int serial;
  private final String owner;

  /*
    コンストラクタにpublicがついていないことで同パッケージ内からのみアクセスを許可する.
    つまりidcardパッケージ外からnewを使ってインスタンス化できないことを表している.
    IDCardのインスたんを生成するには必ずIDCardFactoryを経由しなければいけない.
   */
  IDCard(int serial, String owner) {
    System.out.println("通し番号:" + serial + " 所持者:" + owner + "のカードを作ります。");
    this.serial = serial;
    this.owner = owner;
  }

  public String getOwner() {
    return owner;
  }

  public int getSerial() {
    return serial;
  }

  @Override
  public void use() {
    System.out.println(this + "を使います。");
  }

  @Override
  public String toString() {
    return "[IDCard:" + owner + "(" + serial + ")" + "]";
  }

}