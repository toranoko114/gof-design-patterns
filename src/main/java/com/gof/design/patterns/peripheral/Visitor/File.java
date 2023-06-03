package com.gof.design.patterns.peripheral.Visitor;

public class File extends Entry {

  private final String name;
  private final int size;

  public File(String name, int size) {
    this.name = name;
    this.size = size;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    return size;
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
