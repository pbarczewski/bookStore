package com.pbarczewski.common.validator;

public enum ResultStatus {

    OK("Ok"),
    ERROR("Error"),
    VALIDATION_ERROR("ValidationError");

    private String code;

    ResultStatus(String code) {
        this.code = code;
    }
}
