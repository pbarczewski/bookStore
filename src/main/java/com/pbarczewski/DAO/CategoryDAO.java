package com.pbarczewski.DAO;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pbarczewski.entity.Book;
import com.pbarczewski.entity.Category;

@Repository
public interface CategoryDAO extends JpaRepository<Category, Integer> {
	
	
	default Category findSpecificCategory(String category) {
		
		Category specificCategory = null;
		
		for(Category singleCategory : this.findAll()) {
			if(singleCategory.getName().contains(category)) {
				specificCategory = singleCategory;
			}
		}
		
		if(specificCategory ==null) {
			System.out.println("Wymyślić stronę błędu pozniej");
		}
		
		return specificCategory;
		
	}
	
	default List<Book> findBooksWithinCategory(Category category, Pageable pageable) {
		
		
		return category.getBooks();
		
		
	}
	

}
