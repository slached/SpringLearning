package com.example.restapi.utils.exceptions

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandle {

    //this handles the whole exceptions
    @ExceptionHandler(Exception::class)
    fun catchAllExceptions(exception: Exception): ResponseEntity<ApiErrorObject> {
        val error = ApiErrorObject(exception.message, HttpStatus.BAD_REQUEST)
        return ResponseEntity(error, HttpStatus.BAD_REQUEST)
    }

    //this is movie exception handler
    @ExceptionHandler(MovieException::class)
    fun catchTheExceptions(exception: Exception): ResponseEntity<ApiErrorObject> {
        val error = ApiErrorObject(exception.message, HttpStatus.BAD_REQUEST)
        return ResponseEntity(error, HttpStatus.BAD_REQUEST)
    }

}