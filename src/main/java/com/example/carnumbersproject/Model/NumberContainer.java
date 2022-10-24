package com.example.carnumbersproject.Model;

import org.springframework.stereotype.Component;

import java.util.HashSet;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;

@Component
public class NumberContainer {

    // Car numbers in integer view
    private final HashSet<Integer> carNumbers = new HashSet<>();

    public boolean exists(Integer carNumber) {
        return carNumbers.contains(carNumber);
    }

    public boolean checkAvailabilityOfCarNumbers() {
        return carNumbers.size() > MAX_VALUE_CAR_NUMBER;
    }

    public void add(Integer carNumber) {
        carNumbers.add(carNumber);
    }

}