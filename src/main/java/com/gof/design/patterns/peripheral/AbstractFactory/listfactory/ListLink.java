package com.gof.design.patterns.peripheral.AbstractFactory.listfactory;

import com.gof.design.patterns.peripheral.AbstractFactory.factory.Link;

public class ListLink extends Link {

  public ListLink(String caption, String url) {
    super(caption, url);
  }

  @Override
  public String makeHTML() {
    return "<li><a href=%s>%s</a></li>\n".formatted(url, caption);
  }
}
