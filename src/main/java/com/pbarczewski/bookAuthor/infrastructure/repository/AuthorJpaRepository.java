package com.pbarczewski.bookAuthor.infrastructure.repository;

import com.pbarczewski.author.infrastructure.model.Author;
import com.pbarczewski.book.infrastructure.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorJpaRepository extends JpaRepository<Author, Long> {


}
