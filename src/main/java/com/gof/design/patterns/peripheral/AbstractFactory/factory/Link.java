package com.gof.design.patterns.peripheral.AbstractFactory.factory;

public abstract class Link extends Item {

  protected String url;

  public Link(String caption, String url) {
    super(caption);
    this.url = url;
  }

}
