package org.example;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.removeIf(book::equals);
    }

    public ArrayList<Book> getAllBooks() {
        return books;
    }
}

