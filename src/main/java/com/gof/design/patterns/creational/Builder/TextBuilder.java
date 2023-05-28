package com.gof.design.patterns.creational.Builder;

import java.util.Arrays;

public class TextBuilder implements Builder {

  private final StringBuilder sb = new StringBuilder();

  @Override
  public void makeTitle(String title) {
    sb.append("==========================\n");
    sb.append("『");
    sb.append(title);
    sb.append("』\n\n");
  }

  @Override
  public void makeString(String str) {
    sb.append("■");
    sb.append(str);
    sb.append("』\n\n");
  }

  @Override
  public void makeItems(String[] items) {
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
  public void close() {
    sb.append("==========================\n");
  }

  public String getTextResult() {
    return sb.toString();
  }
}
