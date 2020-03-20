package com.pbarczewski.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="images")
	private String images;
	
	@Column(name="birth_date")
	private String birth_date;
	
	@Column(name="nationality")
	private String nationality;
	
	/*
	 * @ManyToMany(fetch=FetchType.LAZY, cascade = {CascadeType.PERSIST,
	 * CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	 * 
	 * @JoinTable( name="author_book", joinColumns= @JoinColumn(name="author_id"),
	 * inverseJoinColumns= @JoinColumn(name="book_id") )
	 */
	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();
	
	public Author() {
		
	}
	
	public Author(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	


	
	
	
	
}
