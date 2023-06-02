package com.gof.design.patterns.peripheral.AbstractFactory;

import com.gof.design.patterns.peripheral.AbstractFactory.factory.Factory;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Link;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Page;
import com.gof.design.patterns.peripheral.AbstractFactory.factory.Tray;

public class Main {

  public static void main(String[] args) {
    if (args.length != 2) {
      System.exit(0);
    }
    String fileName = args[0];
    String className = args[1];

    Factory factory = Factory.getFactory(className);

    Link blog = factory.createLink("Blog1", "https://example.com/blog1");
    Link blog2 = factory.createLink("Blog2", "https://example.com/blog2");

    Tray blogTray = factory.createTray("Blog Site");
    blogTray.add(blog);
    blogTray.add(blog2);

    Link news1 = factory.createLink("News 1", "https://example.com/new1");
    Link news2 = factory.createLink("News 2", "https://example.com/new2");
    Tray news3 = factory.createTray("News3");
    news3.add(factory.createLink("News3(Japan)", "https://example.com/new3jp"));

    Tray newsTray = factory.createTray("News Site");
    newsTray.add(news1);
    newsTray.add(news2);
    newsTray.add(news3);

    Page page = factory.createPage("Blog and News", "Mike");
    page.add(blogTray);
    page.add(newsTray);

    page.output(fileName);

  }

}
