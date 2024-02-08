package com.university.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Lector was not found")
public class LectorWasNotFound extends RuntimeException {

    public LectorWasNotFound(String message) {
        super(message);
    }
}
