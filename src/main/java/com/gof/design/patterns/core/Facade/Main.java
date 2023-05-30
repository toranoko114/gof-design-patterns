package com.gof.design.patterns.core.Facade;

import com.gof.design.patterns.core.Facade.pagemaker.PageMaker;

public class Main {

  public static void main(String[] args) {
    PageMaker.makeWelcomePage("test1@test.com", "Welcome.html");
  }
}
