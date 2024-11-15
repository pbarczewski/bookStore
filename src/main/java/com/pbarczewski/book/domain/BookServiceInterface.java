package com.pbarczewski.book.domain;

import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.common.validator.ObjectValidationModel;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public interface BookServiceInterface {
    ObjectValidationModel createBook(BookModel bookModel);
    BookModel getSingleBook(String uuid);

}
