package com.gof.design.patterns.peripheral.AbstractFactory.listfactory;

import com.gof.design.patterns.peripheral.AbstractFactory.factory.Tray;

public class ListTray extends Tray {

  public ListTray(String caption) {
    super(caption);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<li>\n");
    sb.append(caption);
    sb.append("\n<ul>\n");
    tray.forEach(item -> sb.append(item.makeHTML()));
    sb.append("</ul>\n");
    sb.append("</li>\n");
    return sb.toString();
  }
}
