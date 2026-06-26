package org.example;

import java.time.LocalDate;
import java.util.Date;

public class Book {
    private Long id;
    private String title;
    private String author;
    private int year;
    private Boolean available;

    public Book (Long id, String title, String author, int year) {
        if (id == null || id < 0) {
            throw new IllegalArgumentException("ID cannot be null or negative.");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        if (year > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year cannot be higher than current year.");
        }

        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        available = true;

    }

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public Boolean getAvailable() {
        return available;
    }

    public void changeToNotAvailable() {
        if (available = true) {
            available = false;
        }
        else {
            throw new IllegalArgumentException("Book is already not available.");
        }
    }

    public void changeToAvailable() {
        if (available = false) {
            available = true;
        }
        else {
            throw new IllegalArgumentException("Book is already available.");
        }
    }
}
