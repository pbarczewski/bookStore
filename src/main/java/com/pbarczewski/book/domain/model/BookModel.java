package com.pbarczewski.book.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class BookModel {

    private String externalId;
    private String description;
    private String insertDate;
    private String price;
    private String title;
    private String subtitle;
    private String publishedYear;

}
