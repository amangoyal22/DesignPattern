package com.pattern.creational.prototype;

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        var bookShop = new BookShop();
        bookShop.setName("TestShop");
        bookShop.loadBook();

        var bookShop1 = (BookShop) bookShop.clone();
        bookShop.getBooks().remove(2);
        bookShop1.setName("Test2Shop");
        System.out.println(bookShop.toString());
        System.out.println(bookShop1.toString());
    }
}
