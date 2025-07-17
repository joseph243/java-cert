package org.example;

public class Book {
    private String title = "";
    private String author = "";
    private String ISBN = "";
    private int year = 0;

    public Book()
    {
        //empty constructor.
    }

    public Book(String inTitle, String inAuthor, String inISBN, int inYear)
    {
        this.title = inTitle;
        this.author = inAuthor;
        this.ISBN = inISBN;
        this.year = inYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object inObj)
    {
        if (inObj == null)
        {
            return false;
        }
        if (!inObj.getClass().equals(Book.class))
        {
            return false;
        }
        Book b = (Book)inObj;
        if (b.getISBN().equals(this.ISBN))
        {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book " + this.title + " by " + this.author + " ISBN: " + this.getISBN() + " year: " + this.getYear();
    }
}
