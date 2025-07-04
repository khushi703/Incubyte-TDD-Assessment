package org.example;

import java.util.Objects;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }
        // Split on comma or newline
        String[] numbersArray = input.split("[,\n]");
        int sumOfArray = 0;
        for (String number : numbersArray) {
            if(!number.isEmpty()) {
                sumOfArray += Integer.parseInt(number);
            }
        }
        return sumOfArray;
    }
}
