package com.example.carnumbersproject.Model.Utils;

public class Constants {

    // "1727" for three character and "999" for three digit in car number
    // 1727 = 12*12*12-1 <- it is enough to encode 3 characters for our alphabet
    // to understand it  please see unit test generateCarNumbers in class CarNumberTest
    public static final int MAX_VALUE_CAR_NUMBER = 1727999;

    // russian alphabet order
    public static final char[] POSSIBLE_CHARACTER_IN_CAR_NUMBERS = new char[]{'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};


}