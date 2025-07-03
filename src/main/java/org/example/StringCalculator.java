package org.example;

import java.util.Objects;

public class StringCalculator {
    public static int add(String input) {
        if(Objects.equals(input, "")) {
            return 0;
        }
        if (input.contains(","))
        {
            String[] numbersArray = input.split(",");
            int sumOfArray = 0;
            for(String number : numbersArray) {
                sumOfArray += Integer.parseInt(number);
            }
            return sumOfArray;
        }
        return Integer.parseInt(input);
    }
}
