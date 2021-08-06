package com.toy.test.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionAdviceController {

    @ExceptionHandler(CommonException.class)
    @ResponseBody
    public ResponseEntity<CommonException> ExceptionHandler(CommonException msg){
        return new ResponseEntity<CommonException>(msg, HttpStatus.INTERNAL_SERVER_ERROR);
    }




}
