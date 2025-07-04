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
    @Test
    public void testCanHandleNewlineAsDelimiter() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
        assertEquals(1,StringCalculator.add("1,\n"));
    }
    @Test
    public void testCanHandleCustomDelimiter() {
        assertEquals(7, StringCalculator.add("//;\n3;4"));
    }
}
