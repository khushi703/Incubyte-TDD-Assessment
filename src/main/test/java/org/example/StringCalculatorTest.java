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
    @Test
    public void testCanThrowsExceptionForNegativeNumbers() {
        try{
            StringCalculator.add("-1,2,-8");
        }
        catch (IllegalArgumentException e) {
            assertEquals("Negatives not allowed: [-1,-8]", e.getMessage());
        }
    }
    @Test
    public void testCanIgnoreNumberGraterThen1000(){
        assertEquals(2, StringCalculator.add("2,1001"));
        assertEquals(7, StringCalculator.add("7,1001"));
        assertEquals(1002, StringCalculator.add("2,1000"));
    }
}
