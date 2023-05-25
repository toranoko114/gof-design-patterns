package com.gof.design.patterns.core.Iterator;

import java.util.Iterator;

/**
 * 本棚を表すクラス
 */
public class BookShelf implements Iterable<Book> {

  private final Book[] books;
  private int last = 0;

  public BookShelf(int maxsize) {
    this.books = new Book[maxsize];
  }

  public Book getBookAt(int index) {
    return books[index];
  }

  public void appendBook(Book book) {
    this.books[last] = book;
    last++;
  }

  public int getLength() {
    return last;
  }

  @Override
  public Iterator<Book> iterator() {
    // BookShelfIterator型の変数に代入せずあくまでIterator<Book>のメソッドを使うという意思表示
    return new BookShelfIterator(this);
  }
}
