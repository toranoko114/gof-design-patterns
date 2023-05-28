package com.gof.design.patterns.creational.Builder;

public class Director {

  private final Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("一般的なあいさつ");
    builder.makeItems(new String[]{"Hi.", "Hello."});
    builder.makeString("時間帯に応じたあいさつ");
    builder.makeItems(new String[]{"Good morning.", "Good afternoon.", "Good evening"});
    builder.close();
  }

}
