package com.pbarczewski.common.validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectValidationModel {

    private ResultStatus resultStatus;
    private String uuid;
    private final List<String> messages = new ArrayList<>();

    public static ObjectValidationModel getResultStatusError() {
        return ObjectValidationModel
            .builder()
            .resultStatus(ResultStatus.ERROR)
            .build();
    }

    public ObjectValidationModel checkResultStatusAndGetObject() {
        if(!this.messages.isEmpty()) {
            this.resultStatus = ResultStatus.VALIDATION_ERROR;
        } else {
            this.resultStatus = ResultStatus.OK;
        }
        return this;
    }
}
