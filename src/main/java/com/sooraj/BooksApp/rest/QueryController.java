package com.sooraj.BooksApp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sooraj.BooksApp.entity.Book;

@RestController
@RequestMapping("/api")
public class QueryController {
	
	@GetMapping("/books")
	public String test() {
		
		System.out.println("welcome to controller");
		return "welcome to controller";
	}
//	
	
	

}
