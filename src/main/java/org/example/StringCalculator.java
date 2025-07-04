package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String input) {
        if (input == null || input.isEmpty()) { // if input is ""
            return 0;
        }

        String DELIMITER = "[,\n]";
        // Extract custom delimiter if present
        if (input.startsWith("//")) {
            int delimiterEnd = input.indexOf('\n');
            String delimiterSection = input.substring(2, delimiterEnd);
            if (delimiterSection.startsWith("[") && delimiterSection.endsWith("]")) {
                DELIMITER = Pattern.quote(delimiterSection.substring(1, delimiterSection.length() - 1));
            } else {
                DELIMITER = Pattern.quote(delimiterSection);
            }
            input = input.substring(delimiterEnd + 1);
        }
        String[] numbersArray = input.split(DELIMITER);
        int sumOfArray = 0;
        List<Integer> negativesNums = new ArrayList<>();
        for (String number : numbersArray) {
            if(number.trim().isEmpty()) {
                continue;
            }
                int num = Integer.parseInt(number.trim());
                if(num<0){
                    negativesNums.add(num);
                }
                if(num<=1000) {
                    sumOfArray += num;
                }
            }
        if (!negativesNums.isEmpty()) {
            throw new IllegalArgumentException(
                    "Negatives not allowed: [" + negativesNums.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(",")) + "]"
            );

        }
        return sumOfArray;
    }
}
