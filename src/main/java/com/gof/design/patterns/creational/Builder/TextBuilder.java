package com.gof.design.patterns.creational.Builder;

import java.util.Arrays;

public class TextBuilder extends Builder {

  private final StringBuilder sb = new StringBuilder();

  @Override
  void makeTitle(String title) {
    sb.append("==========================\n");
    sb.append("『");
    sb.append(title);
    sb.append("』\n\n");
  }

  @Override
  void makeString(String str) {
    sb.append("■");
    sb.append(str);
    sb.append("』\n\n");
  }

  @Override
  void makeItems(String[] items) {
    Arrays.stream(items).forEach(
        str -> {
          sb.append("　・");
          sb.append(str);
          sb.append("\n");
        }
    );
    sb.append("\n");
  }

  @Override
  void close() {
    sb.append("==========================\n");
  }

  public String getTextResult() {
    return sb.toString();
  }
}
