package com.gof.design.patterns.peripheral.AbstractFactory.listfactory;

import com.gof.design.patterns.peripheral.AbstractFactory.factory.Page;

public class ListPage extends Page {

  public ListPage(String title, String author) {
    super(title, author);
  }

  @Override
  public String makeHTML() {
    StringBuilder sb = new StringBuilder();
    sb.append("<!DOCTYPE html>\n");
    sb.append("<html><head><title>");
    sb.append(title);
    sb.append("</title></head>");
    sb.append("<body>\n");
    sb.append("<h1>");
    sb.append(title);
    sb.append("</h1>\n");
    sb.append("<ul>\n");
    content.forEach(item -> sb.append(item.makeHTML()));
    sb.append("</ul>\n");
    sb.append("<hr><address>");
    sb.append(author);
    sb.append("</address>");
    sb.append("</body></html>");
    return sb.toString();
  }
}
