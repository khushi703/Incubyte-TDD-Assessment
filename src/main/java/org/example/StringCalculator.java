package org.example;

import java.util.Objects;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }
        // use a constant for delimiters for clarity and in future addition of new delimiters
        final String DELIMITER = "[,\n]";
        String[] numbersArray = input.split(DELIMITER);
        int sumOfArray = 0;
        for (String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                sumOfArray += Integer.parseInt(number.trim());
            }
        }
        return sumOfArray;
    }
}
