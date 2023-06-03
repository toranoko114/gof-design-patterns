package com.gof.design.patterns.peripheral.Decorator;

import java.util.stream.IntStream;

public abstract class Display {

  public abstract int getColumns();

  public abstract int getRows();

  public abstract String getRowText(int row);

  public void show() {
    IntStream.range(0, getRows()).forEach(
        i -> System.out.println(getRowText(i))
    );
  }

}
