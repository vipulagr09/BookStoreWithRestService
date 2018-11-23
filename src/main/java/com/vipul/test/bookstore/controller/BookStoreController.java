package com.vipul.test.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vipul.test.bookstore.service.BookStoreService;
import com.vipul.test.bookstore.service.model.BookStore;

@RestController
public class BookStoreController {
	
	@Autowired
	private BookStoreService bookStoreService;
	
	@GetMapping("/getAllBooks")
	public List<BookStore> getAllBooks() {
		
		return bookStoreService.getAllBooks();
	}

}
