package com.pbarczewski.book.service;

import com.pbarczewski.book.domain.BookRepositoryInterface;
import com.pbarczewski.book.domain.BookServiceInterface;
import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.common.validator.ObjectValidationModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService implements BookServiceInterface {

    @Autowired
    private BookRepositoryInterface bookRepositoryInterface;

    @Override
    @Transactional
    public ObjectValidationModel createBook(BookModel bookModel)  {
        return bookRepositoryInterface.createBook(bookModel);
    }
}
