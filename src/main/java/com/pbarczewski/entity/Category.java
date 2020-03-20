package com.pbarczewski.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@OneToMany(mappedBy="category",
			cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
					CascadeType.DETACH, CascadeType.REFRESH}
			)
	private List<Book> books = new ArrayList<>();
	
	public Category() {
		
	}
	
	public void addBook(Book book) {
		books.add(book);
		book.setCategory(this);
	}
	
	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
	

}
