package com.pbarczewski.book.util;

import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.common.validator.GeneralValidator;
import com.pbarczewski.common.validator.ObjectValidationModel;
import com.pbarczewski.common.validator.ResultStatus;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;



@Component
public class BookValidator extends GeneralValidator {

    public ObjectValidationModel validateBook(BookModel bookModel ) {
        ObjectValidationModel objectValidationModel = new ObjectValidationModel();
        if(bookModel == null) {
            objectValidationModel.setResultStatus(ResultStatus.ERROR);
            return objectValidationModel;
        }
        validateEmptyObjects(bookModel, objectValidationModel);
        checkIfPriceIsCorrect(bookModel, objectValidationModel);
        return objectValidationModel.checkResultStatusAndGetObject();
    }

    private void validateEmptyObjects(BookModel bookModel, ObjectValidationModel objectValidationModel) {
        if(!isNotEmptyString(bookModel.getTitle())) {
            addMessage("book.title.empty", objectValidationModel);
        }
        if(!isNotEmptyString(bookModel.getPublishedYear())) {
            addMessage("book.published.year.empty", objectValidationModel);
        }
        if(!ieNotEmptyObject(bookModel.getPrice())) {
            addMessage("book.price.empty", objectValidationModel);
        }
    }

    private void checkIfPriceIsCorrect(BookModel bookModel, ObjectValidationModel objectValidationModel) {
        if(bookModel.getPrice() != null) {
            try {
                BigDecimal bigDecimal = bookModel.getPrice();
                if(bigDecimal.compareTo(BigDecimal.ZERO) <= 0){
                    addMessage("book.price.incorrect", objectValidationModel);
                }
            } catch (NumberFormatException e) {
                addMessage("book.price.incorrect", objectValidationModel);
            }
        }
    }

}
