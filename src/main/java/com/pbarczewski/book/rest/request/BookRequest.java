package com.pbarczewski.book.rest.request;

import com.pbarczewski.book.domain.model.BookModel;
import lombok.Data;

@Data
public class BookRequest {
    private BookModel bookModel;
}
