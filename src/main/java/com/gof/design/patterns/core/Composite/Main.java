package com.gof.design.patterns.core.Composite;

public class Main {

  public static void main(String[] args) {
    System.out.println("Making root entries");
    Directory rootDir = new Directory("root");
    Directory binDir = new Directory("bin");
    Directory tmpDir = new Directory("tmp");
    Directory usrDir = new Directory("usr");

    rootDir.add(binDir);
    rootDir.add(tmpDir);
    rootDir.add(usrDir);

    binDir.add(new File("vi", 1000));
    binDir.add(new File("latex", 2000));

    rootDir.printList();
    System.out.println();

    System.out.println("Making user entries");
    Directory mike = new Directory("Mike");
    Directory showy = new Directory("Showy");
    usrDir.add(mike);
    usrDir.add(showy);

    mike.add(new File("mike_v1", 1000));
    mike.add(new File("mike_v2", 2000));
    showy.add(new File("showy_v1", 3000));

    rootDir.printList();
  }
}
