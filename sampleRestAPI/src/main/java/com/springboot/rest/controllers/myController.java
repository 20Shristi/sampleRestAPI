package com.springboot.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.models.Book;
import com.springboot.rest.services.BookService;

@RestController
@RequestMapping("book")
public class myController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/home")
	public String home() {
		return "home page";
	}

	@GetMapping("/book-by-id/{id}")
	public Book getBookById(@PathVariable("id") int sbnNO) {
		return bookService.getById(sbnNO);
	}
	
	@GetMapping("/books-by-author/{author}")
	public List<Book> getBookByAuthor(@PathVariable String author) {
		return bookService.getBooksByAuthor(author);
	}
	
//http://localhost:8080/books-by-category/?category=fiction
	@GetMapping("/books-by-category")
	public List<Book> getBookByCategory(@RequestParam("category") String category) {
		return bookService.getBooksBycategory(category);
	}
}
