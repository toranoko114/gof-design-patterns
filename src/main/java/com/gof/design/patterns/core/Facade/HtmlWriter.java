package com.gof.design.patterns.core.Facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {

  private final Writer writer;

  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  // タイトル
  public void title(String title) throws IOException {
    writer.write("<!DOCTYPE html>");
    writer.write("<html>");
    writer.write("<head>");
    writer.write("<title>" + title + "</title>");
    writer.write("</head>");
    writer.write("<body>");
    writer.write("\n");
    writer.write("<h1>" + title + "</h1>");
    writer.write("\n");
  }

  // 段落の出力
  public void paragraph(String msg) throws IOException {
    writer.write("<p>" + msg + "</p>");
    writer.write("\n");
  }

  // リンクの出力
  public void link(String href, String caption) throws IOException {
    paragraph("<a href=\"" + href + "\">" + caption + "</a>");
  }

  // メールアドレスの出力
  public void mailTo(String mailAddress, String userName) throws IOException {
    link("mailto:" + mailAddress, userName);
  }

  // 閉じる
  public void close() throws IOException {
    writer.write("</body>");
    writer.write("</html>");
    writer.write("\n");
    writer.close();
  }
}
