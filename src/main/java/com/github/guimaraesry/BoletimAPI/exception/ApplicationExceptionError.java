package com.github.guimaraesry.BoletimAPI.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author Ryan
 */

@ControllerAdvice
public class ApplicationExceptionError extends ResponseEntityExceptionHandler {
    
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity duplicatedValuesDatabaseHandler(Exception e) {
        DefaultError err = new DefaultError(
                HttpStatus.BAD_REQUEST.value(), 
                "Valores duplicados no banco não são permitidos!"
        );
        return new ResponseEntity(err, HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(Exception.class)
    public ResponseEntity generalHandler(Exception e) {
        DefaultError err = new DefaultError(
                HttpStatus.INTERNAL_SERVER_ERROR.value(), 
                "Ocorreu um erro não identificado!"
        );
        return new ResponseEntity(err, HttpStatus.BAD_REQUEST);
    }
    
}
