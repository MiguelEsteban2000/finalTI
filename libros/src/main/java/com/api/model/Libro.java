package com.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nameBook;
    private String publisher;
    private String autor;
    private int pages;
    private String category;

    
    public Libro() {
    }


    public Libro(int id, String nameBook, String publisher, String autor, int pages, String category) {
        this.id = id;
        this.nameBook = nameBook;
        this.publisher = publisher;
        this.autor = autor;
        this.pages = pages;
        this.category = category;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return nameBook;
    }


    public void setName(String nameBook) {
        this.nameBook = nameBook;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getPages() {
        return pages;
    }


    public void setPages(int pages) {
        this.pages = pages;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    
}
