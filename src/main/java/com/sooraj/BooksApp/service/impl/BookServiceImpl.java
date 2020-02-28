package com.sooraj.BooksApp.service.impl;

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
		
		this.bookRepo.save(book);
		
		return null;
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findByName(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

}
