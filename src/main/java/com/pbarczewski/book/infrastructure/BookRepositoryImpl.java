package com.pbarczewski.book.infrastructure;

import com.pbarczewski.book.domain.BookRepositoryInterface;
import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.book.infrastructure.mapper.BookMapper;
import com.pbarczewski.book.infrastructure.model.Book;
import com.pbarczewski.book.infrastructure.repository.BookJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
@Slf4j
public class BookRepositoryImpl implements BookRepositoryInterface {

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public String createBook(BookModel bookModel) throws Exception {
        try {
            if(bookModel != null) {
                String externalId = UUID.randomUUID().toString();
                Book book = BookMapper.convertToBook(bookModel, externalId);
                bookJpaRepository.saveAndFlush(book);
                return externalId;
            }
        } catch (Exception e) {
            throw new Exception("Error while saving book");
        }
        return null;
    }

    @Override
    public BookModel getSingleBook(String uuid) {
        try {
            Book book =  bookJpaRepository.getBookByBookExternalId(uuid).orElse(null);
            if(book != null) {
                return BookMapper.convertToBookModel(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
