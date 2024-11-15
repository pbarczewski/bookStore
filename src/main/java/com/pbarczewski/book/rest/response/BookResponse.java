package com.pbarczewski.book.rest.response;

import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.common.util.ResponseBody;
import lombok.Data;

@Data
public class BookResponse extends ResponseBody {
    private BookModel bookModel;
}
