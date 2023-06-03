package com.gof.design.patterns.peripheral.Decorator;

public class StringDisplay extends Display {

  private final String str;

  public StringDisplay(String str) {
    this.str = str;
  }

  @Override
  public int getColumns() {
    return str.length();
  }

  @Override
  public int getRows() {
    return 1;
  }

  @Override
  public String getRowText(int row) {
    if (row != 0) {
      throw new IndexOutOfBoundsException();
    }
    return str;
  }
}