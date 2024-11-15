package com.pbarczewski.common.util;

import lombok.Data;
import org.springframework.http.HttpStatus;
import java.util.List;


@Data
public class ResponseBody {
    private HttpStatus httpStatus;
    private List<String> messages;
}
