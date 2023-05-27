package com.gof.design.patterns.core.TemplateMethod;

public class CharDisplay extends AbstractDisplay {

  private final char ch;

  public CharDisplay(char ch) {
    this.ch = ch;
  }

  @Override
  void open() {
    System.out.print("<<");
  }

  @Override
  void print() {
    System.out.print(ch);
  }

  @Override
  void close() {
    System.out.println(">>");
  }
}
