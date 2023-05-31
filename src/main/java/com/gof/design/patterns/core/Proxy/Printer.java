package com.gof.design.patterns.core.Proxy;

import java.util.stream.IntStream;

public class Printer implements Printable {

  private String name;

  public Printer() {
    heavyJob("Printerのインスタンスを生成中");
  }

  public Printer(String name) {
    this.name = name;
    heavyJob("Printerのインスタンス(%s)を生成中".formatted(name));
  }

  private void heavyJob(String msg) {
    System.out.print(msg);
    IntStream.range(0, 5).forEach(
        i -> {
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            System.out.println("エラーです.");
          }
          System.out.print(".");
        }
    );
    System.out.println("完了.");
  }


  @Override
  public void setPrinterName(String name) {
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return this.name;
  }

  @Override
  public void print(String str) {
    System.out.println("===" + name + "===");
    System.out.println(str);
  }
}
