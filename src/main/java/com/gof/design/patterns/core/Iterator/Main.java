package com.gof.design.patterns.core.Iterator;

public class Main {

  public static void main(String[] args) {
    var bookShelf = new BookShelf(4);
    bookShelf.appendBook(new Book("A"));
    bookShelf.appendBook(new Book("B"));
    bookShelf.appendBook(new Book("C"));
    bookShelf.appendBook(new Book("D"));

    var it = bookShelf.iterator();
    while (it.hasNext()) {
      var book = it.next();
      System.out.println(book.getName());
    }
    System.out.println();

    for (var book : bookShelf) {
      System.out.println(book.getName());
    }
    System.out.println();
  }
}
