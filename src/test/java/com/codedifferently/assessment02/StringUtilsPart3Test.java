package com.codedifferently.assessment02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsPart3Test {

    @Test
    public void reverseAndMagicLetterShiftTest01(){
        // Given
        String input = "cat";
        String expected = "tcA";

        // When
        String actual = StringUtilsPart3.reverseAndMagicLetterShift(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseAndMagicLetterShiftTest02(){
        // Given
        String input = "race";
        String expected = "ecar";

        // When
        String actual = StringUtilsPart3.reverseAndMagicLetterShift(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseAndMagicLetterShiftTest03(){
        // Given
        String input = "delicate";
        String expected = "etaciled";

        // When
        String actual = StringUtilsPart3.reverseAndMagicLetterShift(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reverseAndMagicLetterShiftTest04(){
        // Given
        String input = "pioneer";
        String expected = "reeoipN";

        // When
        String actual = StringUtilsPart3.reverseAndMagicLetterShift(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shiftTheOddCharToEvenTest01(){
        // Given
        String input = "abcde";
        String expected = "bbddf";

        // When
        String actual = StringUtilsPart3.shiftTheOddCharToEven(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shiftTheOddCharToEvenTest02(){
        // Given
        String input = "xyz";
        String expected = "xzz";

        // When
        String actual = StringUtilsPart3.shiftTheOddCharToEven(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shiftTheOddCharToEvenTest03(){
        // Given
        String input = "wutang";
        String expected = "xvtbnh";

        // When
        String actual = StringUtilsPart3.shiftTheOddCharToEven(input);

        // Then
        Assertions.assertEquals(expected, actual);
    }
}
