package com.gof.design.patterns.core.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 本棚を表すクラス（集合体）
 */
public class BookShelf implements Iterable<Book> {

  private final List<Book> books;

  public BookShelf(int initSize) {
    this.books = new ArrayList<>(initSize);
  }

  public Book getBookAt(int index) {
    return books.get(index);
  }

  public void appendBook(Book book) {
    this.books.add(book);
  }

  public int getLength() {
    return books.size();
  }

  @Override
  public Iterator<Book> iterator() {
    // BookShelfIterator型の変数に代入せずあくまでIterator<Book>のメソッドを使うという意思表示
    return new BookShelfIterator(this);
  }
}
