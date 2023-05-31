package com.gof.design.patterns.core.Proxy;

import org.springframework.util.ObjectUtils;

public class PrinterProxy<E> implements Printable {

  private String name;
  private Printer real;
  private Class<E> clazz;

  public PrinterProxy() {
    this.name = "No Name";
    this.real = null;
  }

  public PrinterProxy(String name, Class<E> clazz) {
    this.name = name;
    this.real = null;
    this.clazz = clazz;
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
      try {
        real = (Printer) clazz.getDeclaredConstructor().newInstance();
        real.setPrinterName(name);
      } catch (Exception e) {
        System.out.println("エラーです.");
      }

    }
  }
}
