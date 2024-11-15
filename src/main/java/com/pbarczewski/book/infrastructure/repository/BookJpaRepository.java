package com.pbarczewski.book.infrastructure.repository;

import com.pbarczewski.book.infrastructure.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;


@Repository
public interface BookJpaRepository extends JpaRepository<Book, Long> {

    @Query("SELECT a FROM Book a WHERE a.externalId = :bookExternalId")
    Optional<Book> getBookByBookExternalId(String bookExternalId);

}
