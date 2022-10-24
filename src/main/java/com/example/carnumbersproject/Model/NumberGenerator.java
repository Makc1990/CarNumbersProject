package com.example.carnumbersproject.Model;

import com.example.carnumbersproject.Model.Exception.NoNumbersLeftException;
import org.springframework.stereotype.Component;

import java.util.Random;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;

@Component
public class NumberGenerator {

    private final NumberIterator iterator;
    private final NumberContainer container;
    private final Random random = new Random();

    NumberGenerator(
            NumberIterator carNumberIterator,
                       NumberContainer container) {
        this.iterator = carNumberIterator;
        this.container = container;
    }

    public CarNumber getNext() throws NoNumbersLeftException {
        Integer carNumber;
        do {
            if (container.checkAvailabilityOfCarNumbers()) {
                throw new NoNumbersLeftException();
            }
            carNumber = generateNext();
        } while (container.exists(carNumber));
        iterator.setCurrentCarNumber(carNumber);
        container.add(carNumber);
        return new CarNumber(carNumber);
    }

    public CarNumber getRandom() throws NoNumbersLeftException {
        Integer carNumber;
        if (container.checkAvailabilityOfCarNumbers()) {
            throw new NoNumbersLeftException();
        }
        carNumber = random.nextInt(MAX_VALUE_CAR_NUMBER + 1);

        // if this number is busy then get next
        while(container.exists(carNumber)) {
            carNumber = generateNext();
        }
        iterator.setCurrentCarNumber(carNumber);
        container.add(carNumber);
        return new CarNumber(carNumber);
    }

    private Integer generateNext() {
        int currentDigitsValue = iterator.getNext();
        if (currentDigitsValue > MAX_VALUE_CAR_NUMBER) {
            currentDigitsValue = 0;
        }
        return currentDigitsValue;
    }

}