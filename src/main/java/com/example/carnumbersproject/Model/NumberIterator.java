package com.example.carnumbersproject.Model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;

@Component
public class NumberIterator {

    @Getter
    @Setter
    private Integer currentCarNumber = MAX_VALUE_CAR_NUMBER; // last value, after increment starts from first value

    public Integer getNext() {
        return currentCarNumber + 1;
    }


}
