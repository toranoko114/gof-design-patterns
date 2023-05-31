package com.gof.design.patterns.core.Proxy;

import org.springframework.util.ObjectUtils;

public class PrinterProxy implements Printable {

  private String name;
  private Printer real;

  public PrinterProxy() {
    this.name = "No Name";
    this.real = null;
  }

  public PrinterProxy(String name) {
    this.name = name;
    this.real = null;
  }

  @Override
  public synchronized void setPrinterName(String name) {
    if (!ObjectUtils.isEmpty(real)) {
      // 本人にも設定する
      real.setPrinterName(name);
    }
    this.name = name;
  }

  @Override
  public String getPrinterName() {
    return name;
  }

  @Override
  public void print(String str) {
    realize();
    real.print(str);
  }

  private synchronized void realize() {
    if (ObjectUtils.isEmpty(real)) {
      real = new Printer(name);
    }
  }
}
