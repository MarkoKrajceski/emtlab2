package com.homework.library.repository;

import com.homework.library.model.Author;
import com.homework.library.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
