package com.example.carnumbersproject.Controller;

import com.example.carnumbersproject.Model.NumberGenerator;
import com.example.carnumbersproject.Model.Exception.NoNumbersLeftException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CarNumberController {

    private final NumberGenerator numberGenerator;

    public CarNumberController(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    @GetMapping("/number/next")
    public String getNext() {
        try {
            return numberGenerator.getNext().toString();
        } catch (NoNumbersLeftException e) {
            return e.getMessage();
            // todo: return response with error code ?
        }
    }

    @GetMapping("/number/random")
    public String getRandom() {
        try {
            return numberGenerator.getRandom().toString();
        } catch (NoNumbersLeftException e) {
            return e.getMessage();
            // todo: return response with error code ?
        }
    }
}
