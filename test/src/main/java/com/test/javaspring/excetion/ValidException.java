package com.test.javaspring.excetion;

import lombok.Getter;
import org.springframework.validation.FieldError;

import java.util.List;

public class ValidException extends RuntimeException {


    public ValidException(String message, List<FieldError> fieldErrors) {
        super(message);
    }
}
