package com.sooraj.BooksApp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sooraj.BooksApp.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

	Optional<Book> findByName(String name);

}
