package com.pbarczewski.common.util;


import lombok.Data;

@Data
public class ObjectCreationResponse extends ResponseBody {

    private String createdObjectUuid;

}
