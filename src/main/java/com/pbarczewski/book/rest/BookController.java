package com.pbarczewski.book.rest;

import com.pbarczewski.book.domain.BookServiceInterface;
import com.pbarczewski.book.domain.model.BookModel;
import com.pbarczewski.book.rest.request.BookRequest;
import com.pbarczewski.book.rest.response.BookResponse;
import com.pbarczewski.common.util.ObjectCreationResponse;
import com.pbarczewski.common.validator.ObjectValidationModel;
import com.pbarczewski.common.validator.ResultStatus;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookServiceInterface bookServiceInterface;

    @Operation(
        summary = "Add a new book",
        description = "Adds a new book to the database",
        responses = {
            @ApiResponse(responseCode = "201", description = "Book successfully created"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
        })
    @ApiResponses(value = {@ApiResponse( content = @Content( mediaType = "application/json", schema = @Schema(implementation = ObjectCreationResponse.class)))})
    @PostMapping("/")
    public ResponseEntity<ObjectCreationResponse> createBook(@RequestBody BookRequest bookRequest) {
        ObjectCreationResponse objectCreationResponse = new ObjectCreationResponse();
        HttpStatus result = HttpStatus.NOT_FOUND;
        ObjectValidationModel objectValidationModel = bookServiceInterface.createBook(bookRequest.getBookModel());
        if(objectValidationModel.getResultStatus() == ResultStatus.OK) {
            objectCreationResponse.setCreatedObjectUuid(objectValidationModel.getUuid());
            objectCreationResponse.setHttpStatus(HttpStatus.CREATED);
        } else {
            objectCreationResponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            objectCreationResponse.setMessages(objectValidationModel.getMessages());
        }
        return ResponseEntity.status(result).body(objectCreationResponse);
    }

    @Operation(
        summary = "Add a new book",
        description = "Adds a new book to the database",
        responses = {
            @ApiResponse(responseCode = "201", description = "Book successfully created"),
            @ApiResponse(responseCode = "400", description = "Invalid input"),
            @ApiResponse(responseCode = "500", description = "Internal server error")
        })
    @ApiResponses(value = {@ApiResponse( content = @Content( mediaType = "application/json", schema = @Schema(implementation = BookResponse.class)))})
    @GetMapping("/{bookExternalId}")
    public ResponseEntity<BookResponse> getBook(@PathVariable String bookExternalId) {
        BookResponse bookResponse = new BookResponse();
        HttpStatus result = HttpStatus.NOT_FOUND;
        BookModel bookModel = bookServiceInterface.getSingleBook(bookExternalId);
        if(bookModel != null) {
            bookResponse.setBookModel(bookModel);
            bookResponse.setHttpStatus(HttpStatus.OK);
        } else {
            return ResponseEntity.status(result).body(null);
        }
        return ResponseEntity.status(result).body(bookResponse);
    }
}
