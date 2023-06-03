package com.gof.design.patterns.peripheral.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Directory extends Entry implements Iterable<Entry> {

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

  public Entry add(Entry entry) {
    directory.add(entry);
    return this;
  }

  @Override
  public Iterator<Entry> iterator() {
    return directory.iterator();
  }

  @Override
  public void accept(Visitor v) {
    v.visit(this);
  }
}
