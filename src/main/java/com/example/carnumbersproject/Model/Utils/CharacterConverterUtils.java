package com.example.carnumbersproject.Model.Utils;

import static com.example.carnumbersproject.Model.Utils.Constants.POSSIBLE_CHARACTER_IN_CAR_NUMBERS;

public class CharacterConverterUtils {

    // extract character from POSSIBLE_CHARACTER_IN_CAR_NUMBERS
    // for example, 1 -> А, 2 -> В , 11 -> Х
    public static char getChar(int i) {
        if (i < 0 || i > 11) {
            throw new RuntimeException("Is not possible value for character");
        } else {
            return POSSIBLE_CHARACTER_IN_CAR_NUMBERS[i];
        }
    }


    // extract three character from int view
    // for example, 145 -> [В,А,В];
    // see unit test fullPartCharacterCarNumber
    public static char[] extractCharacters(int partChars) {
        int thirdCharacter = partChars % 12;
        int firstAmdSecondChar = partChars / 12;
        int secondCharacter = firstAmdSecondChar % 12;
        int firstCharacter = firstAmdSecondChar / 12;
        return new char[]{getChar(firstCharacter), getChar(secondCharacter), getChar(thirdCharacter)};
    }


}
