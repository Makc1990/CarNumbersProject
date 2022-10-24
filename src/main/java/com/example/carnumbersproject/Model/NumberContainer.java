package com.example.carnumbersproject.Model;

import org.springframework.stereotype.Component;

import java.util.HashSet;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;

@Component
public class NumberContainer {

    // Car numbers in integer view
    // to understand it  please see unit test generateCarNumbers in class CarNumberTest
    private final HashSet<Integer> carNumbers = new HashSet<>();

    public boolean exists(Integer carNumber) {
        return carNumbers.contains(carNumber);
    }

    // we need to check if there are available numbers
    public boolean checkAvailabilityOfCarNumbers() {
        return carNumbers.size() > MAX_VALUE_CAR_NUMBER;
    }

    public void add(Integer carNumber) {
        carNumbers.add(carNumber);
    }

}