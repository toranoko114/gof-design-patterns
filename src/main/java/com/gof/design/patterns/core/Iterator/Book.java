package com.gof.design.patterns.core.Iterator;

/**
 * 本を表すクラス
 */
public class Book {

  private String name;

  public Book(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
