package com.gof.design.patterns.deleted.Flyweight;

public class Main {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.exit(0);
    }
    BigString bs = new BigString(args[0]);
    bs.print();
  }
}
