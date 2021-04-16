package com.homework.library.model;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Author {
    private @Id @GeneratedValue Long id;
    private String name;
    private String surname;
    @ManyToOne
    private Country country;

    private @Version @JsonIgnore Long version;

    public Author(){}

    public Author(String name, String surname, Country country) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id.equals(author.id) && name.equals(author.name) && surname.equals(author.surname) && country.equals(author.country) && version.equals(author.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, country, version);
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country=" + country +
                ", version=" + version +
                '}';
    }
}
