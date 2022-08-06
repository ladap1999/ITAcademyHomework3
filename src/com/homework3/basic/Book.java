package com.homework3.basic;

import java.util.Comparator;
import java.util.Set;

public class Book implements Comparator<Book>{
    private  String bookName;
    private String bookAuthorName;
    private String bookAuthorSurname;
    private String bookAuthorSecondName;
    private int yearOfCreation;

    public Book() {
    }

    public Book(String bookName, String bookAuthorName, String bookAuthorSurname, String bookAuthorSecondName, int yearOfCreation) {
        this.bookName = bookName;
        this.bookAuthorName = bookAuthorName;
        this.bookAuthorSurname = bookAuthorSurname;
        this.bookAuthorSecondName = bookAuthorSecondName;
        this.yearOfCreation = yearOfCreation;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public void setBookAuthorName(String bookAuthorName) {
        this.bookAuthorName = bookAuthorName;
    }

    public String getBookAuthorSurname() {
        return bookAuthorSurname;
    }

    public void setBookAuthorSurname(String bookAuthorSurname) {
        this.bookAuthorSurname = bookAuthorSurname;
    }

    public String getBookAuthorSecondName() {
        return bookAuthorSecondName;
    }

    public void setBookAuthorSecondName(String bookAuthorSecondName) {
        this.bookAuthorSecondName = bookAuthorSecondName;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
   /* public int compare1(Book o1, Book o2) {
        return o1.getBookAuthorName().compareTo(o2.getBookAuthorName());
    }
    public int compare2(Book o1, Book o2) {
        return o1.getBookAuthorSecondName().compareTo(o2.getBookAuthorSecondName());
    }
    public int compare3(Book o1, Book o2) {
        return o1.getBookAuthorSurname().compareTo(o2.getBookAuthorSurname());
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearOfCreation != book.yearOfCreation) return false;
        if (!bookName.equals(book.bookName)) return false;
        if (!bookAuthorName.equals(book.bookAuthorName)) return false;
        if (!bookAuthorSurname.equals(book.bookAuthorSurname)) return false;
        return bookAuthorSecondName.equals(book.bookAuthorSecondName);
    }

    @Override
    public int hashCode() {
        int result = bookName.hashCode();
        result = 31 * result + bookAuthorName.hashCode();
        result = 31 * result + bookAuthorSurname.hashCode();
        result = 31 * result + bookAuthorSecondName.hashCode();
        result = 31 * result + yearOfCreation;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", bookAuthorSurname='" + bookAuthorSurname + '\'' +
                ", bookAuthorSecondName='" + bookAuthorSecondName + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                '}';
    }


}
