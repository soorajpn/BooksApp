package com.sooraj.BooksApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sooraj.BooksApp.entity.Book;
import com.sooraj.BooksApp.service.BookService;

@RestController //It adds @Request body to the methods so we response is not html/jsp but json/xml
				//so no need to add @ResponseBody annotation
@RequestMapping("/api")
public class QueryController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/bookByname")
	public Book bookByname(@RequestParam String name) {
		System.out.println("book to be find "+name);
		return this.bookService.findByName(name);
	}

	
	

}
