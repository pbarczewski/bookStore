package com.pbarczewski.book.service;

import com.pbarczewski.book.domain.BookRepositoryInterface;
import com.pbarczewski.book.domain.BookServiceInterface;
import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.book.util.BookValidator;
import com.pbarczewski.common.validator.ObjectValidationModel;
import com.pbarczewski.common.validator.ResultStatus;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService implements BookServiceInterface {

    @Autowired
    private BookRepositoryInterface bookRepositoryInterface;
    @Autowired
    private BookValidator bookValidator;

    @Override
    @Transactional
    public ObjectValidationModel createBook(BookModel bookModel)  {
        ObjectValidationModel objectValidationModel = bookValidator.validateBook(bookModel);
        if(objectValidationModel.getResultStatus() != ResultStatus.OK) {
            return objectValidationModel;
        }
        try {
            String uuid = bookRepositoryInterface.createBook(bookModel);
            if(uuid != null) {
                objectValidationModel.setUuid(uuid);
            }
        } catch (Exception e) {
            e.printStackTrace();
            objectValidationModel.setResultStatus(ResultStatus.ERROR);
        }
        return objectValidationModel;
    }

    @Override
    public BookModel getSingleBook(String uuid) {
        if(uuid == null || uuid.isEmpty()) {
            return null;
        }
        return bookRepositoryInterface.getSingleBook(uuid);
    }
}
