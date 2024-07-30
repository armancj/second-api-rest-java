package com.gdai.secondapirestjava;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UnitConversionException extends RuntimeException {
    public UnitConversionException(String message) {
        super(message);
    }
}
