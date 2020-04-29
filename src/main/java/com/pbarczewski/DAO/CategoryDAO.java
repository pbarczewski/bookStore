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
		
		for(Category singleCategory : this.findAll()) {
			if(singleCategory.getName().contains(category)) {
				selectedCategory = singleCategory;
			}
		}
		
		if(selectedCategory ==null) {
			System.out.println("Wymyślić stronę błędu pozniej");
		}
		
		return selectedCategory;
		
	}
	
	@SuppressWarnings("deprecation")
	default public Page<Book> findAllByCategory(Category category, Pageable pageable) {
		
		List<Book> booksInCategory = category.getBooks();
		int start = (int) pageable.getOffset();
		int end = (start + pageable.getPageSize()) > booksInCategory.size() ? booksInCategory.size() : (start + pageable.getPageSize());
		Page<Book> pages = new PageImpl<Book>(booksInCategory.subList(start, end), pageable, booksInCategory.size());
		
		return pages;
		
	}
	
	

}
