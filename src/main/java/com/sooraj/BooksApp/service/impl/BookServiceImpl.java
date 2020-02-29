package com.sooraj.BooksApp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sooraj.BooksApp.entity.Book;
import com.sooraj.BooksApp.repo.BookRepository;
import com.sooraj.BooksApp.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookRepository bookRepo;

	@Override
	public Book saveBook(Book book) {
		

		return this.bookRepo.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		
		return this.bookRepo.save(book);

	}

	@Override
	public void delete(Long id) {
		 this.bookRepo.deleteById(id);
	}

	@Override
	public Book findByName(String name) {
		System.out.println("book to be find "+name);

		 Optional<Book> result=this.bookRepo.findByName(name);
		 if(result.isPresent())return result.get();
		 
		 else return null;
	}

}
