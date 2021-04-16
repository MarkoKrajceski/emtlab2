package com.homework.library.model;


import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Locale;
import java.util.Objects;

@Entity
public class Book {

    private @Id @GeneratedValue Long id;
    private String name;
    private Category category;
    @ManyToOne
    private Author author;
    private Integer availableCopies;
    private @Version @JsonIgnore Long version;


    public Book() {}

    public Book(String name, Category category, Author author, Integer availableCopies) {
        this.name = name;
        this.category = category;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && name.equals(book.name) && category == book.category && author.equals(book.author) && availableCopies.equals(book.availableCopies) && version.equals(book.version);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", author=" + author +
                ", availableCopies=" + availableCopies +
                ", version=" + version +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, author, availableCopies);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}