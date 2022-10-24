package com.example.carnumbersproject.Model.Utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterConverterUtilsTest {

    @Test
    public void checkAllPossibleSingleCharacter() {
        final char[] currentArray = new char[12];

        for (int i = 0; i <= 11; i++) {
            currentArray[i] = CharacterConverterUtils.getChar(i);
        }

        assertArrayEquals(POSSIBLE_CHARACTER_IN_CAR_NUMBERS, currentArray);
    }

    @Test
    public void negativeCaseSingleCharacterForLowBound() {
        Throwable throwable = assertThrows(Throwable.class, () -> {
            com.example.carnumbersproject.Model.Utils.CharacterConverterUtils.getChar(-1);
        });

        assertEquals(RuntimeException.class, throwable.getClass());
    }

    @Test
    public void negativeCaseSingleCharacterForHighBound() {
        Throwable throwable = assertThrows(Throwable.class, () -> {
            com.example.carnumbersproject.Model.Utils.CharacterConverterUtils.getChar(12);
        });

        assertEquals(RuntimeException.class, throwable.getClass());
    }

    @Test
    public void fullPartCharacterCarNumber() {
        // all third character
        assertEquals("ААА", getCharPart(0));
        assertEquals("ААВ", getCharPart(1));
        assertEquals("ААЕ", getCharPart(2));
        assertEquals("ААК", getCharPart(3));
        assertEquals("ААМ", getCharPart(4));
        assertEquals("ААН", getCharPart(5));
        assertEquals("ААО", getCharPart(6));
        assertEquals("ААР", getCharPart(7));
        assertEquals("ААС", getCharPart(8));
        assertEquals("ААТ", getCharPart(9));
        assertEquals("ААУ", getCharPart(10));
        assertEquals("ААХ", getCharPart(11));

        // bound second character
        assertEquals("АВА", getCharPart(12));
        assertEquals("АВВ", getCharPart(13));

        // bound third character
        assertEquals("АХХ", getCharPart(143));
        assertEquals("ВАА", getCharPart(144));
        assertEquals("ВАВ", getCharPart(145));

        // max value
        assertEquals("ХХХ", getCharPart(1727));
    }

    public static final char[] POSSIBLE_CHARACTER_IN_CAR_NUMBERS = new char[]{'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'};

    @Test
    public void negativeCaseFullCharacterForHighBound() {
        Throwable throwable = assertThrows(Throwable.class, () -> {
            getCharPart(1728);
        });
        assertEquals(RuntimeException.class, throwable.getClass());
    }

    @Test
    public void negativeCaseFullCharacterForLowBound() {
        Throwable throwable = assertThrows(Throwable.class, () -> {
            getCharPart(-1);
        });
        assertEquals(RuntimeException.class, throwable.getClass());
    }

    private String getCharPart(int i) {
        return new String(CharacterConverterUtils.extractCharacters(i));
    }

}