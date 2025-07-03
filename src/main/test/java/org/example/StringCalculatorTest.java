package org.example;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
import org.example.StringCalculator;
public class StringCalculatorTest {

    @Test
    public static void testEmptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }
}
