package com.pbarczewski.entity;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, 
					CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="category_id")
	private Category category;
	
	@Column(name="release_date")
	private String release_date;
	
	@Column(name="images")
	private String images;

	@ManyToMany(fetch=FetchType.LAZY, 
			cascade = {CascadeType.PERSIST, CascadeType.MERGE,
					CascadeType.DETACH, CascadeType.REFRESH})
	@JoinTable(
			name="author_book",
			joinColumns= @JoinColumn(name="book_id", referencedColumnName="id"),
			inverseJoinColumns=@JoinColumn(name="author_id", referencedColumnName="id")
			)
	private List<Author> authors = new ArrayList<>();
	
	@Column(name="rating")
	private Double rating;
	
	@Column(name="votes")
	private Integer votes;
	
	public Book() {
		
	}
	
	public Book(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	
}
