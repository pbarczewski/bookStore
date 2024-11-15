package com.pbarczewski.book.rest;

import com.pbarczewski.book.domain.BookServiceInterface;
import com.pbarczewski.book.rest.request.BookRequest;
import com.pbarczewski.book.rest.response.BookResponse;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @ApiResponses(value = {@ApiResponse( content = @Content( mediaType = "application/json", schema = @Schema(implementation = BookResponse.class)))})
    @PostMapping("/")
    public ResponseEntity<BookResponse> createBook(@RequestBody BookRequest bookRequest) {
        BookResponse bookResponse = new BookResponse();
        HttpStatus result = HttpStatus.NOT_FOUND;
        ObjectValidationModel objectValidationModel = bookServiceInterface.createBook(bookRequest.getBookModel());
        if(objectValidationModel.getResultStatus() == ResultStatus.OK) {
            bookResponse.setHttpStatus(HttpStatus.CREATED);
            bookResponse.setUuid(objectValidationModel.getUuid());
        } else {
            bookResponse.setHttpStatus(HttpStatus.INTERNAL_SERVER_ERROR);
            bookResponse.setMessages(objectValidationModel.getMessages());
        }
        return ResponseEntity.status(result).body(bookResponse);

    }


}
