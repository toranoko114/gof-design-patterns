package com.gof.design.patterns.core.TemplateMethod;

import java.util.stream.IntStream;

public class StringDisplay extends AbstractDisplay {

  private final String str;

  public StringDisplay(String str) {
    this.str = str;
  }

  @Override
  void open() {
    this.printLine();
  }

  @Override
  void print() {
    System.out.println("|" + str + "|");
  }

  @Override
  void close() {
    this.printLine();
  }

  private void printLine() {
    System.out.print("+");
    IntStream.range(0, str.length()).forEach(i -> System.out.print("-"));
    System.out.println("+");
  }
}
