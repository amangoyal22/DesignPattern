package com.pattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The type Book shop.
 * Cloneable - Markable interface
 */
public class BookShop implements Cloneable {

    /**
     * The Name.
     */
    private String name;
    /**
     * The Books.
     */
    private List<Book> books;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets books.
     *
     * @return the books
     */
    public List<Book> getBooks() {
        if (Objects.isNull(books)) {
            books = new ArrayList<>();
        }
        return books;
    }

    /**
     * Sets books.
     *
     * @param books the books
     */
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    /**
     * Load book.
     */
    public void loadBook() {
        for (int i = 1; i < 11; i++) {
            var book = new Book();
            book.setId(i);
            book.setName("Book".concat(String.valueOf(i)));
            getBooks().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        var bookshop = new BookShop();
        for (var book:this.getBooks()) {
            bookshop.getBooks().add(book);
        }
        return bookshop;
    }
}
