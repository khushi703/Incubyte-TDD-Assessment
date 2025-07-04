package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }

        String DELIMITER = "[,\n]";
        // Extract custom delimiter if present
        if (input.startsWith("//")) {
            int delimiterEnd = input.indexOf('\n');
            String delimiter = input.substring(2, delimiterEnd);
            DELIMITER = Pattern.quote(delimiter);
            input = input.substring(delimiterEnd + 1);
        }
        String[] numbersArray = input.split(DELIMITER);
        int sumOfArray = 0;
        List<Integer> negativesNums = new ArrayList<>();
        for (String number : numbersArray) {
            if(!number.trim().isEmpty()) {
                int num = Integer.parseInt(number.trim());

                if(num<0){
                    negativesNums.add(num);
                }
                sumOfArray += num;
            }
        }
        return sumOfArray;
    }
}
