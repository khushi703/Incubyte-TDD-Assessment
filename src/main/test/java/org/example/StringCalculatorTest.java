package org.example;
import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;
public class StringCalculatorTest {

    @Test
    public static void testEmptyStringReturnsZero() {
        assertEquals(0, StringCalculator.add(""));
    }
    @Test
    public static void testSingleNumber() {
        assertEquals(7, StringCalculator.add("7"));
    }
    @Test
    public static void testCommaSeparatedNumbers() {
        assertEquals(14, StringCalculator.add("7,7"));
    }
}
