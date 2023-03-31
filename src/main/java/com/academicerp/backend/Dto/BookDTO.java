package com.academicerp.backend.Dto;

public class BookDTO {

    private String bookName;

    private String publisherName;

    public BookDTO(String bookName, String publisherName) {
        this.bookName = bookName;
        this.publisherName = publisherName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bookName='" + bookName + '\'' +
                ", publisherName='" + publisherName + '\'' +
                '}';
    }
}
