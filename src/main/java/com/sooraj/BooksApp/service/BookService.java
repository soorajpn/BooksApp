package com.sooraj.BooksApp.service;

import com.sooraj.BooksApp.entity.Book;

public interface BookService {
	
	public Book saveBook(Book book);
	public Book updateBook(Book book);
	public Book delete(Integer id);
	public Book findByName(Book book);


}
