package com.pbarczewski.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.pbarczewski.entity.Book;

@Repository
public interface BooksDAO extends JpaRepository<Book, Integer> {

	
	
}
