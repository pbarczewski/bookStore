package com.pbarczewski.book.infrastructure.mapper;

import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.book.infrastructure.model.Book;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class BookMapper {

    public static Book convertToBook(BookModel bookModel, String externalId) {
        return Book.builder()
            .externalId(externalId)
            .description(bookModel.getDescription())
            .insertDate(LocalDateTime.now())
            .price(new BigDecimal(bookModel.getPrice()))
            .title(bookModel.getTitle())
            .subtitle(bookModel.getSubtitle())
            .publishedYear(bookModel.getPublishedYear())
            .build();
    }
}
