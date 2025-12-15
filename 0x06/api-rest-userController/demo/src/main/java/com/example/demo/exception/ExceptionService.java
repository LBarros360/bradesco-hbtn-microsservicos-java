package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler(CPFException.class)
    public ResponseEntity<UserErrorResponse> handleCPFException(CPFException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.BAD_REQUEST.value());
        user.setMessage("You have entered CPF " + err.getMessage() + " invalid.");
        return new ResponseEntity<>(user,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserIdException.class)
    public ResponseEntity<UserErrorResponse> handleUserIdException(UserIdException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.BAD_REQUEST.value());
        user.setMessage(err.getMessage());
        return new ResponseEntity<>(user,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UserNameException.class)
    public ResponseEntity<UserErrorResponse> handleUserNameException(UserNameException err){
        UserErrorResponse user = new UserErrorResponse();
        user.setStatus(HttpStatus.BAD_REQUEST.value());
        user.setMessage(err.getMessage());
        return new ResponseEntity<>(user,HttpStatus.BAD_REQUEST);
    }
}
