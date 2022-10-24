package com.example.carnumbersproject.Model.Utils;

import com.example.carnumbersproject.Model.CarNumber;
import org.junit.jupiter.api.Test;

import static com.example.carnumbersproject.Model.Utils.Constants.MAX_VALUE_CAR_NUMBER;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CarNumberTest {

    @Test
    public void generateCarNumbers() {
        assertEquals("А000АА 116 RUS", new CarNumber(0).toString());
        assertEquals("А001АА 116 RUS", new CarNumber(1).toString());

        assertEquals("А000АВ 116 RUS", new CarNumber(1000).toString());
        assertEquals("А001АВ 116 RUS", new CarNumber(1001).toString());

        assertEquals("А001АХ 116 RUS", new CarNumber(11001).toString());
        assertEquals("А001ВА 116 RUS", new CarNumber(12001).toString());

        assertEquals("В001АА 116 RUS", new CarNumber(144001).toString());

        assertEquals("Х998ХХ 116 RUS", new CarNumber(1727998).toString());
        assertEquals("Х999ХХ 116 RUS", new CarNumber(MAX_VALUE_CAR_NUMBER).toString());
    }

}