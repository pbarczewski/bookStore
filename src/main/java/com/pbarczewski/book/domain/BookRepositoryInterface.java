package com.pbarczewski.book.domain;

import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.common.validator.ObjectValidationModel;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositoryInterface {

    ObjectValidationModel createBook(BookModel bookModel) ;

}
