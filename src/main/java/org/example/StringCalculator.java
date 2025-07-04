package org.example;

import java.util.Objects;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }

        String DELIMITER = "[,\n]";
        // Check for custom delimiter syntax
        if (input.startsWith("//")) {
            int delimiterEnd = input.indexOf('\n');
            DELIMITER = Pattern.quote(input.substring(2, delimiterEnd));
            input = input.substring(delimiterEnd + 1);
        }
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
