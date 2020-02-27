package com.sooraj.BooksApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sooraj.BooksApp.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
