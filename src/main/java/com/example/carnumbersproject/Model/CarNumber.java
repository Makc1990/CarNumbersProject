package com.example.carnumbersproject.Model;

import com.example.carnumbersproject.Model.Utils.CharacterConverterUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;


//A111BE 116 RUS

// {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'} -> 12 characters - > 0-11
// 12^3 (three character) = 12*12*12 = 1728 -> 0..1727
// + 999 for storing all digits
// in total 1727999: "1727" for three characters and "999" - for all digits


@EqualsAndHashCode
@Getter
public class CarNumber {

    public CarNumber(int digitsValue) {
        this.digitsValue = digitsValue;
    }

    private final int digitsValue;

    @Override
    public String toString() {
        int partDigit = digitsValue % 1000;
        int partChars = digitsValue / 1000;

        char[] characters = CharacterConverterUtils.extractCharacters(partChars);

        return "" + characters[0] + String.format("%03d", partDigit) + characters[1] + characters[2]+ " 116 RUS";
    }

}