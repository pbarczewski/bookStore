package com.pbarczewski.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pbarczewski.entity.Book;
import com.pbarczewski.entity.Category;

@Repository
public interface BooksDAO extends JpaRepository<Book, Integer> {


	public Page<Book> findAllByCategory(Category category, Pageable pageable);
	
}
