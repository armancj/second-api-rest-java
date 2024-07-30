package com.gdai.secondapirestjava;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/unit-conversion")
public class UnitConversionController {
    @PostMapping
    public ResponseEntity<ConversionDetails> converter(@RequestBody ConversionDetails conversionDetails) {
        UnitConverter.convert(conversionDetails);;
        return ResponseEntity.ok(conversionDetails);
    }

}
