package com.sooraj.BooksApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooraj.BooksApp.entity.Book;
import com.sooraj.BooksApp.service.BookService;
@RequestMapping("/api") 
@Controller //To sent response as html page name unless method marked with @Response body annotation
public class CommandController {
	
	@Autowired
	BookService bookService;
	
	@ResponseBody
	@PostMapping("/create/book")
	public Book createBook(@RequestBody Book book) {
		
		System.out.println("create book"+book);
		this.bookService.saveBook(book);
		return book;
	}

	@DeleteMapping("/delete/book")
	public void deleteBook(@RequestParam Long id) {
		
		System.out.println("delete book by id "+id);
		this.bookService.delete(id);
	}
	
	@ResponseBody
	@PutMapping("/update/book")
	public Book updateBook(@RequestBody Book book) {
		
		System.out.println("update book "+ book);
		return this.bookService.updateBook(book);
	}

}
