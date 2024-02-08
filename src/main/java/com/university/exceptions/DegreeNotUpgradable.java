package com.university.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Degree can not be upgraded")
public class DegreeNotUpgradable extends RuntimeException {

    public DegreeNotUpgradable(String message) {
        super(message);
    }
}
