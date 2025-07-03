package org.example;

import java.util.Objects;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }
        String[] numbersArray = input.split(","); // if input is comma separated and only one element
        int sumOfArray = 0;
        for (String number : numbersArray) {
            sumOfArray += Integer.parseInt(number);
        }
        return sumOfArray;
    }
}
