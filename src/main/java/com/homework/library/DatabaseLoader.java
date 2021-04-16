package com.homework.library;


import com.homework.library.model.Author;
import com.homework.library.model.Book;
import com.homework.library.model.Category;
import com.homework.library.model.Country;
import com.homework.library.repository.AuthorRepository;
import com.homework.library.repository.BookRepository;
import com.homework.library.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CountryRepository countryRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public DatabaseLoader(CountryRepository countryRepository, AuthorRepository authorRepository,BookRepository bookRepository ) {
        this.countryRepository = countryRepository;
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Country country = new Country("England", "Europe");
        Author author = new Author("Joanne","Rowling", country);
        Book book = new Book("Harry Potter and the Philosopher's Stone", Category.FANTASY, author, 20);
        this.countryRepository.save(country);
        this.authorRepository.save(author);
        this.bookRepository.save(book);
    }
}