package com.pbarczewski.book.infrastructure.model;



import com.pbarczewski.author.infrastructure.model.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "book", schema = "public")
public class Book {

    public final static String BOOK_SEQ_NAME = "BOOK_SEQ_NAME";
    public final static String BOOK_SEQ = "PUBLIC.BOOKS_ID_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "subtitle")
    private String subtitle;

    @Column(name = "description")
    private String description;

    @Column(name = "published_year")
    private String publishedYear;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "insert_date")
    private LocalDateTime insertDate;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "book_author",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();


}
