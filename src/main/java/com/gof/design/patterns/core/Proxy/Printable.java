package com.gof.design.patterns.core.Proxy;

public interface Printable {

  void setPrinterName(String name);

  String getPrinterName();

  void print(String str);
}
