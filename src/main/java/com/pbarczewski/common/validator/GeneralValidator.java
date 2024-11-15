package com.pbarczewski.common.validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import java.util.Locale;

public class GeneralValidator {

    @Autowired
    MessageSource messageSource;

    protected boolean isNotEmptyString(String object) {
        return (object != null || !object.isEmpty());
    }

    protected boolean ieNotEmptyObject(Object object) {
        return object != null;

    }

    protected void addMessage(String message, Object[] objects, ObjectValidationModel objectValidationModel) {
        String msg = messageSource.getMessage(message, objects, Locale.getDefault());
        objectValidationModel.getMessages().add(message);
    }

    protected void addMessage(String message, ObjectValidationModel objectValidationModel) {
        String msg = messageSource.getMessage(message, null, Locale.getDefault());
        objectValidationModel.getMessages().add(msg);
    }

}
