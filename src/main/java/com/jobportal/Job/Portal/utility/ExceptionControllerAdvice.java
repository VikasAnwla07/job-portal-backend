package com.jobportal.Job.Portal.utility;


import com.jobportal.Job.Portal.exception.JobPortalException;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @Autowired
    private Environment environment;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo>generalException(Exception exception){
        val internalServerError = HttpStatus.INTERNAL_SERVER_ERROR.value();
        ErrorInfo error = new ErrorInfo(exception.getMessage(),  internalServerError,  LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(JobPortalException.class)
    public ResponseEntity<ErrorInfo>generalException(JobPortalException exception){
        String erroMessage = environment.getProperty(exception.getMessage());
        val internalServerError = HttpStatus.INTERNAL_SERVER_ERROR.value();
        ErrorInfo error = new ErrorInfo( erroMessage ,  internalServerError,  LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class, ConstraintViolationException.class})
    public ResponseEntity<ErrorInfo>validatorExceptionHandler(Exception exception){
        String errorMessage = "";
        if(exception instanceof MethodArgumentNotValidException manvException){
            errorMessage = manvException.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(", "));
        } else {
            ConstraintViolationException cvException = (ConstraintViolationException) exception;
            errorMessage = cvException.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining(", "));
        }
        ErrorInfo error = new ErrorInfo(errorMessage,  HttpStatus.BAD_REQUEST.value(),  LocalDateTime.now());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
