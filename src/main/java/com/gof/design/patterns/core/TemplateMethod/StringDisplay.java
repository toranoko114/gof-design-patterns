package com.gof.design.patterns.core.TemplateMethod;

import java.util.stream.IntStream;

public class StringDisplay implements AbstractDisplay {

  private final String str;

  public StringDisplay(String str) {
    this.str = str;
  }

  @Override
  public void open() {
    this.printLine();
  }

  @Override
  public void print() {
    System.out.println("|" + str + "|");
  }

  @Override
  public void close() {
    this.printLine();
  }

  private void printLine() {
    System.out.print("+");
    IntStream.range(0, str.length()).forEach(i -> System.out.print("-"));
    System.out.println("+");
  }
}
