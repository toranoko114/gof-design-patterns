package com.gof.design.patterns.core.Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {

  public PageMaker() {
  }

  public static void makeWelcomePage(String mailAddress, String fileName) {
    try {
      Properties mailProperties = Database.getProperties("mailData");
      String userName = mailProperties.getProperty(mailAddress);
      HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
      writer.title(userName + "'s web page");
      writer.paragraph("Welcome to " + userName + "'s web page");
      writer.paragraph("Nice to mee you");
      writer.mailTo(mailAddress, userName);
      writer.close();
      System.out.println(fileName + " is created for " + mailAddress + " (" + userName + ")");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
