package com.vipul.test.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vipul.test.bookstore.service.model.BookStore;
import com.vipul.test.bookstore.service.repository.BookStoreRepository;

@Service
public class BookStoreService {

	
	@Autowired
	private BookStoreRepository bookStoreRepo;
	
	public List<BookStore> getAllBooks() {
		return bookStoreRepo.findAll();
	}
}
