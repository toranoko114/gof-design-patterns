package com.gof.design.patterns.core.Facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

class HtmlWriter {

  private final Writer writer;

  public HtmlWriter(Writer writer) {
    this.writer = writer;
  }

  // タイトル
  public void title(String title) throws IOException {
    String htmlTitle = """
        <!DOCTYPE html>
        <html>
          <head>
            <title>%s</title>
          </head>
          <body>
            <h1>%s</h1>
        """.formatted(title, title);
    writer.write(htmlTitle);
  }

  // 段落の出力
  public void paragraph(String msg) throws IOException {
    String htmlParagraph = """
            <p>%s</p>
        """.formatted(msg);
    writer.write(htmlParagraph);
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
    String htmlClose = """
          </body>
        </html>
        """;
    writer.write(htmlClose);
    writer.close();
  }
}
