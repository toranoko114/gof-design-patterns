package com.gof.design.patterns.core.TemplateMethod;

import java.util.stream.IntStream;

public interface AbstractDisplay {

  void open();

  void print();

  void close();

  /**
   * テンプレートメソッドはオーバーライドすべきではないという思想からfinal宣言している。
   */
  default void display() {
    open();
    IntStream.range(0, 5).forEach(i -> print());
    close();
  }
}
