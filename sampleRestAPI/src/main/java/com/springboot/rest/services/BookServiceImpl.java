package com.springboot.rest.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.springboot.rest.models.Book;
@Service
public class BookServiceImpl implements BookService{

	@Override
	public Book getById(int sbnNO) {
		
		return getBookList().stream().filter((book)->book.getSbnNo()==sbnNO).findAny().get();
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		return getBookList().stream().filter((book)->book.getAuthor().equals(author)).collect(Collectors.toList());
	}

	@Override
	public List<Book> getBooksBycategory(String category){
		
		return getBookList()
				.stream()
				.filter((book)->book.getCategory().equals(category))
				.collect(Collectors.toList());
	}
	
	private List<Book> getBookList(){
		return Arrays.asList(new Book(1001, "java", "kathy", "Tech"),
				new Book(1010, "spring", "Rod", "Tech"),
				new Book(1111, "Captain", "Hal", "Comic"),
				new Book(2001, "Miracle", "Kathy", "Fiction"),
				new Book(2020, "python", "Russom", "Tech")
				);
	}

}
