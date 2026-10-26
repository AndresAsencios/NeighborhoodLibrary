package com.pluralsight;

public class Book {

      private  int bookId;
      private  String isbn;
      private  String bookTitle;
      private  boolean isCheckedOut;
      private  String checkOutTo;

    public Book(int id, String isbn, String bookTitle) {
        this.bookId = id;
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.isCheckedOut = false;
        this.checkOutTo = "";
    }

      public void checkOut(String name) {
        if(!this.isCheckedOut && name !=null && !name.isBlank()) {
            this.isCheckedOut = true;
            this.checkOutTo = name;
        }

      }

      public void checkIn() {
        this.isCheckedOut = false;
        this.checkOutTo = "";

      }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void setCheckOutTo(String checkOutTo) {
        this.checkOutTo = checkOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}


