package com.gof.design.patterns.core.Composite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ディレクトリ：Composite（複合体）の役割（枝みたいな役割?）
 */
public class Directory extends Entry {

  private final String name;
  private final List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getSize() {
    AtomicInteger size = new AtomicInteger();
    directory.forEach(entry -> size.getAndAdd(entry.getSize()));
    return size.get();
  }

  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    directory.forEach(entry -> entry.printList(prefix + "/" + name));
  }

  public Entry add(Entry entry) {
    directory.add(entry);
    entry.setParent(this);
    return this;
  }

}
