package com.pbarczewski.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbarczewski.entity.Book;
import com.pbarczewski.entity.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
	
	
	default Category findSpecificCategory(String category) {
		
		Category selectedCategory = null;
		List<Category> allCategories = this.findAll();
		
		for(Category singleCategory : allCategories) {
			if(singleCategory.getName().contains(category)) {
				selectedCategory = singleCategory;
			}
		}
		return selectedCategory;
		
	}
	
	
	default Page<Book> findAllByCategory(Category category, Pageable pageable) {
		
		List<Book> booksInCategory = category.getBooks();
		int start = (int) pageable.getOffset();
		int end = (start + pageable.getPageSize()) > booksInCategory.size() ? booksInCategory.size() : (start + pageable.getPageSize());
		Page<Book> pages = new PageImpl<Book>(booksInCategory.subList(start, end), pageable, booksInCategory.size());
		
		return pages;
		
	}
	
	

}
