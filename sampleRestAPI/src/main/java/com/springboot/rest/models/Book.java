package com.springboot.rest.models;


public class Book {
	
	 private int sbnNo;
     private String title;
     private String author;
     private String category;
     
     
	public Book() {
		super();
	}


	public Book(int sbnNo, String title, String author, String category) {
		super();
		this.sbnNo = sbnNo;
		this.title = title;
		this.author = author;
		this.category = category;
	}


	public int getSbnNo() {
		return sbnNo;
	}


	public void setSbnNo(int sbnNo) {
		this.sbnNo = sbnNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Book [sbnNo=" + sbnNo + ", title=" + title + ", author=" + author + ", category=" + category + "]";
	}
	
     
     
     
}
