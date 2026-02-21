package com.viom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myBook")
public class Book {
	private int bookId;
	private String name;
	private String author;
	
//	public Book() {}
	public Book(@Value("101") int bookId,@Value("The Song of Ice and Fire") String name,@Value("George R.R Martin") String author) {
		//super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
