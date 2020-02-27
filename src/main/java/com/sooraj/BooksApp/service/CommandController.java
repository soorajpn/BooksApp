package com.sooraj.BooksApp.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sooraj.BooksApp.entity.Book;
@RequestMapping("/api")
@Controller
public class CommandController {
	
	@ResponseBody
	@PostMapping("/book")
	public Book createBook(@RequestBody Book book) {
		
		System.out.println("create book"+book);
		return book;
	}


}
