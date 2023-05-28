package com.gof.design.patterns.creational.Builder;

public class Main {

  public static void main(String[] args) {
    if (args.length != 1) {
      System.exit(0);
    }
    if ("text".equals(args[0])) {
      TextBuilder textBuilder = new TextBuilder();
      Director director = new Director(textBuilder);
      director.construct();
      String result = textBuilder.getTextResult();
      System.out.println(result);
    } else if ("html".equals(args[0])) {
      HTMLBuilder htmlBuilder = new HTMLBuilder();
      Director director = new Director(htmlBuilder);
      director.construct();
      String fileName = htmlBuilder.getHTMLResult();
      System.out.println(fileName + "が作成されました.");
    } else {
      System.exit(0);
    }
  }
}
