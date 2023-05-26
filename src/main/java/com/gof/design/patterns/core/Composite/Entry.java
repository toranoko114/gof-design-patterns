package com.gof.design.patterns.core.Composite;

/**
 * ディレクトリ：Componentの役割（Leaf役とComposite役を同一視するための役）
 */
public abstract class Entry {

  public abstract String getName();

  public abstract int getSize();

  public void printList() {
    printList("");
  }

  protected abstract void printList(String prefix);

  @Override
  public String toString() {
    return getName() + "(" + getSize() + ")";
  }
}
