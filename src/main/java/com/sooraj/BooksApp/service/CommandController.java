package com.sooraj.BooksApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooraj.BooksApp.entity.Book;
@RequestMapping("/api") 
@Controller //To sent response as html page name unless method marked with @Response body annotation
public class CommandController {
	
	@Autowired
	BookService bookService;
	
	@ResponseBody
	@PostMapping("/book")
	public Book createBook(@RequestBody Book book) {
		
		System.out.println("create book"+book);
		this.bookService.saveBook(book);
		return book;
	}


}
