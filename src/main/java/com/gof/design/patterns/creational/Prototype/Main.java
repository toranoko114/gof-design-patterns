package com.gof.design.patterns.creational.Prototype;

import com.gof.design.patterns.creational.Prototype.framework.Manager;
import com.gof.design.patterns.creational.Prototype.framework.Product;

public class Main {

  public static void main(String[] args) {
    // 準備
    Manager manager = new Manager();
    UnderlinePen uPen = new UnderlinePen('-');
    MessageBox mBox = new MessageBox('*');
    MessageBox sBox = new MessageBox('/');

    // 登録
    manager.register("strong message", uPen);
    manager.register("warning box", mBox);
    manager.register("slash box", sBox);

    // 生成と使用
    Product p1 = manager.create("strong message");
    p1.use("Hello, World.");
    Product p2 = manager.create("warning box");
    p2.use("Hello, World.");
    Product p3 = manager.create("slash box");
    p3.use("Hello, World.");
  }
}
