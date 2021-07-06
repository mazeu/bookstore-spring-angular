package com.mazeu.bookstore.repositories;

import com.mazeu.bookstore.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Book, Integer> {

}