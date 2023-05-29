package com.gof.design.patterns.core.Facade;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {

  private static final String FILE_PATH = "src/main/java/com/gof/design/patterns/core/Facade/";

  private Database() {
  }

  public static Properties getProperties(String dbName) throws IOException {
    String fileName = FILE_PATH + dbName + ".txt";
    Properties properties = new Properties();
    properties.load(new FileReader(fileName));
    return properties;
  }
}
