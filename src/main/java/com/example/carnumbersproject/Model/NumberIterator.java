package com.example.carnumbersproject.Model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;

@Component
public class NumberIterator {

    // first of all, we call the getNext() method with an increment,
    // so we need to make the first initialization the max value,
    // Then at the first call getNext() will return us 0 (first car number)
    @Getter
    @Setter
    private Integer currentCarNumber = MAX_VALUE_CAR_NUMBER;

    public Integer getNext() {
        return currentCarNumber + 1;
    }

}