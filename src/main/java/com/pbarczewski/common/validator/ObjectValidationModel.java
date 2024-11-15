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

    public static ObjectValidationModel getResultStatus(ObjectValidationModel objectValidationModel) {
        if(!objectValidationModel.getMessages().isEmpty()) {
            objectValidationModel.setResultStatus(ResultStatus.OK);
        } else {
            objectValidationModel.setResultStatus(ResultStatus.VALIDATION_ERROR);
        }
        return objectValidationModel;
    }

}
