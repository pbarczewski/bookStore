package com.pbarczewski.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	private CategoryDAO categoryDAO;
	
	@Autowired
	public MainController(BooksDAO booksDAO, CategoryDAO categoryDAO) {
		this.booksDAO = booksDAO;
		this.categoryDAO = categoryDAO;
	}
	
	@GetMapping("/books")
	public String allBooks(Model model,@RequestParam(defaultValue="0") int page) {
		
		model.addAttribute("books", 
				booksDAO.findAll(PageRequest.of(page, 16)));
		model.addAttribute("currentPage", page);
		return "books";
	}
	
	@GetMapping("/top")
	public String topBooks(Model model,@RequestParam(defaultValue="0") int page) {
		
		model.addAttribute("books", 
				booksDAO.findAll(PageRequest.of(page, 16, Sort.by(Sort.Direction.ASC, "rating"))));
		model.addAttribute("currentPage", page);
		return "topBooks";
	}
	
	@GetMapping("/categories/{category}")
	public String booksByCategory(Model model,
			@PathVariable String category, @RequestParam(defaultValue="0") int page) {
		
		Category selectedCategory = categoryDAO.findSpecificCategory(category);
		List<Category> allCategories = categoryDAO.findAll();
		
		model.addAttribute("books", categoryDAO.findAllByCategory(selectedCategory, PageRequest.of(page, 3)));
		model.addAttribute("selectedCategory", selectedCategory);
		model.addAttribute("currentPage", page);
		model.addAttribute("category", allCategories);
		return "category";
	}
	
	@GetMapping("/categories")
	public String allCategories(Model model,@RequestParam(defaultValue="0") int page) {
		
		List<Category> categories = categoryDAO.findAll();
		model.addAttribute("books", 
				booksDAO.findAll(PageRequest.of(page, 16)));
		model.addAttribute("category", categories);
		model.addAttribute("currentPage", page);
		return "categories";
	}
	
	  @PostMapping("/vote") 
	  public String vote(@ModelAttribute("singleBook") Book book) {
		  
		  System.out.println(book.getRating());
		  
	  return "redirect:/books/" + book.getId() + "/" + book.getTitle();
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
