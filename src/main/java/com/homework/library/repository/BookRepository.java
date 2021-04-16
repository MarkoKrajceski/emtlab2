package com.homework.library.repository;

import com.homework.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
//
//    Optional<Book> findByName(String name);
//
//    void deleteByName(String name);
}
