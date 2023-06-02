package com.gof.design.patterns.peripheral.AbstractFactory.listfactory;

import com.gof.design.patterns.peripheral.AbstractFactory.factory.Factory;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Link;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Page;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Tray;

public class ListFactory extends Factory {

  @Override
  public Link createLink(String caption, String url) {
    return new ListLink(caption, url);
  }

  @Override
  public Tray createTray(String caption) {
    return new ListTray(caption);
  }

  @Override
  public Page createPage(String title, String author) {
    return new ListPage(title, author);
  }
}
