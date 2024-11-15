package com.pbarczewski.book.infrastructure.repository;

import com.pbarczewski.book.infrastructure.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookJpaRepository extends JpaRepository<Book, Long> {


}
