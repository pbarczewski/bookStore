package com.pbarczewski.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pbarczewski.BookRepositoryApplication;
import com.pbarczewski.DAO.AuthorDAO;
import com.pbarczewski.DAO.BooksDAO;
import com.pbarczewski.DAO.CategoryDAO;
import com.pbarczewski.DAO.Testowo;
import com.pbarczewski.entity.Author;
import com.pbarczewski.entity.Book;
import com.pbarczewski.entity.Category;

@Controller
public class MainController {

	
	private BooksDAO booksDAO;
	private AuthorDAO authorDAO;
	private CategoryDAO categoryDAO;
	
	@Autowired
	public MainController(BooksDAO booksDAO, AuthorDAO authorDAO, CategoryDAO categoryDAO) {
		this.booksDAO = booksDAO;
		this.authorDAO = authorDAO;
		this.categoryDAO = categoryDAO;
	}
	
	@GetMapping("/books")
	public String allBooks(Model model,@RequestParam(defaultValue="0") int page) {
		
		model.addAttribute("books", 
				booksDAO.findAll(PageRequest.of(page, 16)));
		model.addAttribute("currentPage", page);
		return "books";
	}
	
	@GetMapping("/books/category/{category}")
	public String booksByCategory(Model model,
			@PathVariable String category, @RequestParam(defaultValue="0") int page) {
		
		Category specificCategory = categoryDAO.findSpecificCategory(category);
		
		model.addAttribute("books", categoryDAO.findAllByCategory(specificCategory, PageRequest.of(page, 3)));
		model.addAttribute("category", 
				specificCategory);
		model.addAttribute("currentPage", page);
		return "categories2";
	}
	
	
	  @PostMapping("/vote") 
	  public String vote(@ModelAttribute("singleBook") Book book) {
		  
		  System.out.println(book.getRating());
		  
	  return "redirect:/books/" + book.getId() + "/" + book.getTitle();
	  }
	 
	
	
	@GetMapping("/test")
	public String save() {
		Author author = authorDAO.getOne(1);
		Book book = booksDAO.getOne(11);
		if(author != null) {
			book.addAuthor(author);
			authorDAO.save(author);
		}	
		return "testowo";
	}
	
	@GetMapping("/test2")
	public String save2() {
		//Category category = new Category("literatura piękna");
		Category category = categoryDAO.getOne(1);
		Book book = booksDAO.getOne(11);
		if(category != null) {
			category.addBook(book);
			categoryDAO.save(category);
		}
		System.out.println(category.getBooks().size());
			
		return "testowo";
	}
	
	
	@GetMapping("/books/{id}/{title}")
	public String singleBook(Model model, @PathVariable int id, @PathVariable String title) {
		Book book = booksDAO.getOne(id);
		if(book == null) {
			System.out.println("TUTAJ TRZEBA STWORZYC REDIRECT BLEDU");
		} else {
			model.addAttribute("book", book);
		}
		
		return "singleBook";
		
	}
	
}
