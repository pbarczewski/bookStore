package com.pbarczewski.book.infrastructure;

import com.pbarczewski.book.domain.BookRepositoryInterface;
import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.book.infrastructure.mapper.BookMapper;
import com.pbarczewski.book.infrastructure.model.Book;
import com.pbarczewski.book.infrastructure.repository.BookJpaRepository;
import com.pbarczewski.common.validator.ObjectValidationModel;
import jakarta.transaction.Transactional;
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
    public ObjectValidationModel createBook(BookModel bookModel) {
        try {
            if(bookModel != null) {
                String externalId = UUID.randomUUID().toString();
                Book book = BookMapper.convertToBook(bookModel, externalId);
                bookJpaRepository.saveAndFlush(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ObjectValidationModel.getResultStatusError();
        }
        return new ObjectValidationModel();
    }



}
