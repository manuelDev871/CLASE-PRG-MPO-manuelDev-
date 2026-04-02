package model;

import java.io.Serializable;

public class Libro implements Serializable {
    private int id;
    private String title;
    private String author;
    private String year;
    private String publisher;

    public Libro() {}

    public Libro(int id, String title, String author, String year, String publisher) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return id + " - " + title + " (" + year + ")";
    }
}