package com.model;

public class Book {
    private int id;
    private String bookName;
    private String author;

    //    Default constructor
    public Book() {
    }

    //    Plain constructor
    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book:\n" +
                bookName + '\'' +
                "\n author='" + author + '\'';
    }
}
