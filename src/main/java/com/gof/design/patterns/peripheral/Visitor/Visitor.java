package com.gof.design.patterns.peripheral.Visitor;

public abstract class Visitor {

  public abstract void visit(File file);

  public abstract void visit(Directory directory);
}
