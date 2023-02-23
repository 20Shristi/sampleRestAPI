package com.springboot.rest.services;

import java.util.List;

import com.springboot.rest.models.Book;

public interface BookService {

	Book getById(int sbnNO);
	List<Book> getBooksByAuthor(String author);
	List<Book> getBooksBycategory(String category);
}
