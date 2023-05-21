package com.ducheng.dynamic.log.desensitize.entity;

public class BookEntity {

    private String bookName;

    private Integer price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public BookEntity() {
    }

    public BookEntity(String bookName, Integer price) {
        this.bookName = bookName;
        this.price = price;
    }
}
