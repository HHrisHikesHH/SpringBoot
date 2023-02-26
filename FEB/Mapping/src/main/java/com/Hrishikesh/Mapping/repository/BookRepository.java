package com.Hrishikesh.Mapping.repository;

import com.Hrishikesh.Mapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
