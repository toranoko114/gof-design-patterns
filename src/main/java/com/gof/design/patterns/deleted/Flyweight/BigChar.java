package com.gof.design.patterns.deleted.Flyweight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {

  private final char charName;
  private String fontData;

  public BigChar(char charName) {
    this.charName = charName;
    try {
      String fileName = "big" + charName + ".txt";
      StringBuilder sb = new StringBuilder();
      Files.readAllLines(Path.of(fileName)).forEach(
          line -> {
            sb.append(line);
            sb.append("\n");
          }
      );
      this.fontData = sb.toString();
    } catch (IOException e) {
      this.fontData = charName + "?";
    }
  }

  public void print() {
    System.out.print(fontData);
  }

}
