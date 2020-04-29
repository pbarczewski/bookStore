package com.pbarczewski.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.pbarczewski.DAO.AuthorDAO;
import com.pbarczewski.entity.Author;

@Controller
public class AuthorController {
	
	
	private AuthorDAO authorDAO;
	
	
	@Autowired
	public AuthorController(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}


	
	@GetMapping("authors")
	private String singleAuthor(Model model, @RequestParam(defaultValue="0") int page) 
	{	
		if(authorDAO.findAll()  == null) {
			System.out.println("TRZEBA WYMYSLIC KOMUNIKAT");
		}
		model.addAttribute("authors", authorDAO.findAll(PageRequest.of(page, 16)));
		model.addAttribute("currentPage", page);
		
		return "authors";
		
	}
	

	@GetMapping("authors/{id}/{name}")
	private String singleAuthor(Model model, @PathVariable int id, @PathVariable String name) 
	{	
		Author author = authorDAO.getOne(id);
		
		
		if(author == null) {
			System.out.println("TRZEBA WYMYSLIC KOMUNIKAT");
		}
		model.addAttribute("author", author);
		
		return "singleAuthor";
		
	}
	
	
	

}
