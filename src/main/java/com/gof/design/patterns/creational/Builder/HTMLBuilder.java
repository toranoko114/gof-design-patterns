package com.gof.design.patterns.creational.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class HTMLBuilder extends Builder {

  private String fileName = "untitled.html";
  private final StringBuilder sb = new StringBuilder();

  @Override
  void makeTitle(String title) {
    fileName = title + ".html";
    sb.append("<!DOCTYPE html>\n");
    sb.append("<html>\n");
    sb.append("<head><title>");
    sb.append(title);
    sb.append("</title></head>\n");
    sb.append("<body>\n");
    sb.append("<h1>");
    sb.append(title);
    sb.append("</h1>\n\n");
  }

  @Override
  void makeString(String str) {
    sb.append("<p>");
    sb.append(str);
    sb.append("</p>\n\n");
  }

  @Override
  void makeItems(String[] items) {
    sb.append("<ul>\n");
    Arrays.stream(items).forEach(
        str -> {
          sb.append("<li>");
          sb.append(str);
          sb.append("</li>\n");
        }
    );
    sb.append("</ul>\n");
  }

  @Override
  void close() {
    sb.append("</body>");
    sb.append("</html>\n");
    try {
      Writer writer = new FileWriter(fileName);
      writer.write(sb.toString());
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public String getHTMLResult() {
    return fileName;
  }
}
