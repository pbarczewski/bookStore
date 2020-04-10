package com.pbarczewski.DAO;

import com.pbarczewski.entity.Book;

public class Testowo {
	
	
	private final Book book;
	private final BooksDAO booksDAO;
	
	
	public Testowo(Book book, BooksDAO booksDAO) {
		this.book = book;
		this.booksDAO = booksDAO;
	}
	
	public void vote () {
		booksDAO.save(book);
	}

}
