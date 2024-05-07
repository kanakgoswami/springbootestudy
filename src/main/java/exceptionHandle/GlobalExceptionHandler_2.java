package org.example.exceptionHandle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler_2 {

    @ExceptionHandler(ProductNotFoundException_1.class)
    public ResponseEntity<Object> handleProductNotFoundException(ProductNotFoundException_1 ex, WebRequest request) {
        String error = "Product not found";
        ErrorResponse_3 errorResponse = new ErrorResponse_3(HttpStatus.NOT_FOUND.value(), error, ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGlobalException(Exception ex, WebRequest request) {
        String error = "Internal Server Error";
        ErrorResponse_3 errorResponse = new ErrorResponse_3(HttpStatus.INTERNAL_SERVER_ERROR.value(), error, ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

