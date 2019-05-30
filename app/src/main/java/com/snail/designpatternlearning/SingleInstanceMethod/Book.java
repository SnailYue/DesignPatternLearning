package com.snail.designpatternlearning.SingleInstanceMethod;

/**
 * @author created by Snail
 * date:2019/5/30
 * email:yuesnail@gmail.com
 */
public class Book {
    private String bookName;
    private float bookPrice;
    private String author;

    private static Book instance = new Book();

    public static Book getInstance() {
        return instance;
    }

    public Book() {

    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
