package com.gof.design.patterns.core.TemplateMethod;

public class Main {

  public static void main(String[] args) {
    var charDisplay = new CharDisplay('E');
    var stringDisplay = new StringDisplay("Hello, World!");
    charDisplay.display();
    System.out.println();
    stringDisplay.display();
  }
}
